package config;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {
	
	@Bean
	public Connection getConnection() throws Exception {
		String url = "jdbc:mysql://localhost:3306/paymentdb";
        String username = "root";
        String password = "root";
        return DriverManager.getConnection(url,username,password);		
	}
}
