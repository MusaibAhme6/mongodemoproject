package com.ty.mongodemoproject.mongoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MultipleMongoConfig {

	@Autowired
	private DBProperties properties;
	
//	@Primary
//	@Bean(name = "DB1Properties")
//	//@ConfigurationProperties(prefix = "spring.data.mongodb.db1")
//	public MongoProperties getDb1Props() {
//		MongoProperties mongoProperties= new MongoProperties();
//		mongoProperties.setUri("mongodb://"+properties.getHost1()+":"+properties.getPort1()+"/"+properties.getDb1());
//
//		return mongoProperties;
//	}
//	
	
//	@Bean(name = "DB2properties")
//	//@ConfigurationProperties(prefix ="spring.data.mongodb.db2")
//	public MongoProperties getDb2Props() {
//		MongoProperties mongoProperties= new MongoProperties();
//		mongoProperties.setUri("mongodb://"+properties.getHost2()+":"+properties.getPort2()+"/"+properties.getDb2());
//		return mongoProperties;
//	}
	
//	@Primary
//	@Bean(name = "db1MongoTemplate")
//	public MongoTemplate db1MongoTemplate() {
//		return new MongoTemplate(db1MongoDatabaseFactory(getDb1Props()));
//	}
	
//	@Primary
//	@Bean
//	public MongoDatabaseFactory db1MongoDatabaseFactory(MongoProperties mongo) {
//		return new SimpleMongoClientDatabaseFactory(mongo.getUri());
//	}
	
//	@Bean
//	public MongoDatabaseFactory db2MongoDatabaseFactory(MongoProperties mongo) {
//		return new SimpleMongoClientDatabaseFactory(mongo.getUri());
//	}
//	
//	@Bean(name = "db2MongoTemplate")
//	public MongoTemplate db2MongoTemplate() {
//		return new MongoTemplate(db2MongoDatabaseFactory(getDb2Props()));
//	}
	public static String getUri(String host,String port,String database) {
		return "mongodb://"+host+":"+port+"/"+database;
	}
	
	@Primary
	@Bean(name = "db1MongoTemplate")
	public MongoTemplate db1MongoTemplate() {
		return new MongoTemplate(new SimpleMongoClientDatabaseFactory(getUri(properties.getHost1(),properties.getPort1(),properties.getDb1())));
	}
	
	@Bean(name = "db2MongoTemplate")
	public MongoTemplate db2MongoTemplate() {
		return new MongoTemplate(new SimpleMongoClientDatabaseFactory(getUri(properties.getHost2(),properties.getPort2(),properties.getDb2())));
	}
	
	
}
