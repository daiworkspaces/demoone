package com.newdemoone.demoone;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class DemonApplication {
	private static final Logger LOG = LoggerFactory.getLogger(DemonApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemonApplication.class);
		Environment env = app.run(args).getEnvironment();
		LOG.info("启动成！");
		LOG.info("地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));


		SpringApplication.run(DemonApplication.class, args);
	}

}
