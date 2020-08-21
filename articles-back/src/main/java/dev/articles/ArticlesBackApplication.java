package dev.articles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySource(ignoreResourceNotFound = true, value =     "classpath:application.properties")
public class ArticlesBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArticlesBackApplication.class, args);
	}

}
