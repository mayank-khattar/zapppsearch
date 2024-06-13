package com.mak.apps.zapppsearch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SuppressWarnings("ALL")
@Configuration
@EnableElasticsearchRepositories(basePackages = "com.mak.apps.zapppsearch")
public class Config extends ElasticsearchConfiguration {

    /**
     * @return Client Configuration
     */
    @Override
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .build();
    }
}
