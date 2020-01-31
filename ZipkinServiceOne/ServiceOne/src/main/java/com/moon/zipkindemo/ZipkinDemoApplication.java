package com.moon.zipkindemo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@SpringBootApplication
public class ZipkinDemoApplication {
	private static final String JDK_LOGGING_PARAM = "sprunk.jdklogging.config";
	private static final String SYS_VAR_LOGGING_FILE = "java.util.logging.config.file";

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public AlwaysSampler alwaysSampler() {
		return new AlwaysSampler();
	}

	public static void main(String[] args) throws IOException {
		ApplicationContext app = SpringApplication.run(ZipkinDemoApplication.class, args);
		setupSplunkConfiguration(app);
		System.out.println(System.getProperty(SYS_VAR_LOGGING_FILE));
		assert  System.getProperty(SYS_VAR_LOGGING_FILE) != null;
	}
	
	private static void setupSplunkConfiguration(ApplicationContext app) throws IOException {
		assert app != null;
		final String CP_JDK_LOGGING_PROPERTIES = app.getEnvironment().getProperty(JDK_LOGGING_PARAM);
		System.setProperty(SYS_VAR_LOGGING_FILE, new ClassPathResource(CP_JDK_LOGGING_PROPERTIES).getFile().getAbsolutePath());
	}
}