package com.aftab.ANTally;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class securityconfig {
	@Bean
public InMemoryUserDetailsManager userdetailservice() {
	UserDetails u=User.withDefaultPasswordEncoder().username("nadeem").password("1234").roles("USER").build();
	return new InMemoryUserDetailsManager(u);
}
}
