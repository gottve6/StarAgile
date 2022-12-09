package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
public class DemoCrudCassandraAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCrudCassandraAppApplication.class, args);
	}

}
