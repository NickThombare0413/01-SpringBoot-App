package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
private map<String,Object>cache=new Hashmap<String,Object>();
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

public void loadDataToCache()
{
}

}
