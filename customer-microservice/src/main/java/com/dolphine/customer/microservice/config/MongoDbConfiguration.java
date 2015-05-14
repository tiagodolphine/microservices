package com.dolphine.customer.microservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.dolphine.customer.repository")
public class MongoDbConfiguration extends AbstractMongoConfiguration {

	@Override
	public String getDatabaseName() {
		return "customer-db";
	}

	@Override
	protected UserCredentials getUserCredentials() {
		return new UserCredentials(System.getenv("MONGODB_USER"), System.getenv("MONGODB_PW"));
	}
	
	@Override
	protected String getAuthenticationDatabaseName() {
		return "customer-db";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient(
				System.getenv("MONGODB_ADDRESS"), 27017);
	}

}