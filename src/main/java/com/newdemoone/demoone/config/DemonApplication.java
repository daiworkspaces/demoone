package com.newdemoone.demoone.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;


@ComponentScan("com.newdemoone")
@SpringBootApplication
public class DemonApplication {
	private static final Logger LOG = LoggerFactory.getLogger(DemonApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemonApplication.class);
		Environment env = app.run(args).getEnvironment();

		LOG.info("启动成功！！");
		LOG.info("地址：\thttps://127.0.0:8088");


	}

}
