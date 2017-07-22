package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

import app.config.AppConfig;


@SpringBootApplication  
@Import(AppConfig.class)
public class BootApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BootApp.class, args);
	}

}
