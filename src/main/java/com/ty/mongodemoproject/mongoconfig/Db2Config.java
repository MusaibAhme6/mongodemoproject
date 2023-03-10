package com.ty.mongodemoproject.mongoconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.ty.mongodemoproject.repository.ticketrepo"},mongoTemplateRef = Db2Config.MONGO_TEMPLATE)
public class Db2Config {

	
	protected static final String MONGO_TEMPLATE="db2MongoTemplate";
}
