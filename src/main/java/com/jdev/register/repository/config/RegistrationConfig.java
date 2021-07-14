//package com.jdev.register.repository.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//import com.mongodb.ServerAddress;
//import com.mongodb.client.MongoClient;
//
//@SuppressWarnings("deprecation")
//@Configuration
//public class RegistrationConfig {
//
//	@Autowired
//    private Environment env;
//	
//	@Bean
//	public MongoDbFactory mongoDbFactory() throws Exception {
//		String host = env.getProperty("spring.data.mongodb.host");
//    	String port = env.getProperty("spring.data.mongodb.port");
//		String db = env.getProperty("spring.data.mongodb.database");
//
//    	ServerAddress serverAddress = new ServerAddress(host, Integer.parseInt(port));
//    	
//		MongoClient mongoClient = new MongoClient(serverAddress);
//		return new SimpleMongoDbFactory(mongoClient, db);
//	}
//	
//	@Bean
//	public MongoTemplate mongoTemplate() throws Exception {
//		return new MongoTemplate(mongoDbFactory());
//	}
//	
//	@Bean
//    public MongoClient mongo() {
//		String host = env.getProperty("spring.data.mongodb.host");
//    	String port = env.getProperty("spring.data.mongodb.port");
//		String db = env.getProperty("spring.data.mongodb.database");
//
//    	ServerAddress serverAddress = new ServerAddress(host, Integer.parseInt(port));
//    	
//        return new MongoClient(serverAddress);
//    }
// 
//    @Bean
//    public MongoTemplate mongoTemplate() throws Exception {
//        return new MongoTemplate(mongo(), "test");
//    }
//	
//}
