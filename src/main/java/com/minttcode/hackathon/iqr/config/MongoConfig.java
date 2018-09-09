package com.minttcode.hackathon.iqr.config;

import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("com.minttcode.hackathon.iqr.model.repos")
@ComponentScan(basePackages = { "com.minttcode.hackathon.iqr"})
public class MongoConfig extends AbstractMongoConfiguration {



    @Override
    protected String getDatabaseName() {
        return "retodb";
    }

    @Bean
    public MongoClient mongo() throws Exception {
        return mongoClient();
    }

    @Override
    protected String getMappingBasePackage() {
        return "com.minttcode.hackathon.iqr.model";
    }

    // ---------------------------------------------------- MongoTemplate

    @Override
    public MongoClient mongoClient() {
        MongoClient client = new MongoClient("127.0.0.1", 27017);
        client.setWriteConcern(WriteConcern.SAFE);
        return client;    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), getDatabaseName());

    }
}
