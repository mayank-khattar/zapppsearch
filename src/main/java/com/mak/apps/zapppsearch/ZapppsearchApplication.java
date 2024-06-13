package com.mak.apps.zapppsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
public class ZapppsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZapppsearchApplication.class, args);
	}

}
