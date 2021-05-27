package com.cg.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class LoginApplication implements CommandLineRunner{
	@Autowired
	private PersonService personservice;

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
	{
		Person p1=new Person();
		p1.setUsername("suresh");
		p1.setPassword(getPasswordEncoder().encode("Sai"));
		p1.setRole("ROLE_ADMIN");
		
		personservice.save(p1);
	}
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return new BCryptPasswordEncoder();
	
	}

}
