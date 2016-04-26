package com.rg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;

@SpringBootApplication
@EntityScan("com.rg.domain")
public class RGApplication {

	public static void main( String[] args ) throws Exception
	{
		SpringApplication.run(RGApplication.class, args);
	}
}
