package com.mak.apps.zapppsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import java.util.List;

public interface WebPageRepository extends ElasticsearchRepository<WebPage, String> {
    List<WebPage> findByTitleContaining(String title);
    List<WebPage> findByContentContaining(String content);
}

