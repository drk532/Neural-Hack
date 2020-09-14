package com.bankmng.chargem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.chargem.BankController","com.chargem.BankService"})
@EnableJpaRepositories(basePackages = "com.chargem.BankRepository")
@EntityScan(basePackages = "com.chargem.Entity")
@EnableAutoConfiguration
public class ChargemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChargemApplication.class, args);
		System.out.println(" done..");
	}

}
