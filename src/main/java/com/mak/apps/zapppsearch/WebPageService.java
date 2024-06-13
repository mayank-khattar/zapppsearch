package com.mak.apps.zapppsearch;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.List;

@Service
public class WebPageService {
    @Autowired
    private WebPageRepository repository;

    public void indexWebPage(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        String title = doc.title();
        String content = doc.body().text();

        WebPage webPage = new WebPage();
        webPage.setUrl(url);
        webPage.setTitle(title);
        webPage.setContent(content);

        repository.save(webPage);
    }

    public List<WebPage> searchByTitle(String title) {
        return repository.findByTitleContaining(title);
    }

    public List<WebPage> searchByContent(String content) {
        return repository.findByContentContaining(content);
    }
}

