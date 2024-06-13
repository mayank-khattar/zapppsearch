package com.mak.apps.zapppsearch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "webpages")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebPage {
    @Id
    private String id;
    private String url;
    private String title;
    private String content;

    // Getters and Setters
}

