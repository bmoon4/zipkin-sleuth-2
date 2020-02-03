package com.moon.zipkindemo;

<<<<<<< HEAD
import java.nio.file.Paths;

=======
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
>>>>>>> 93ab5e56767d454b3655deb8b89b6c234e70124a
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.client.RestTemplate;

<<<<<<< HEAD
@SpringBootApplication 
@ComponentScan()

=======
import java.io.IOException;

@SpringBootApplication
>>>>>>> 93ab5e56767d454b3655deb8b89b6c234e70124a
public class ZipkinDemoApplication {
	private static final String JDK_LOGGING_PARAM = "sprunk.jdklogging.config";
	private static final String SYS_VAR_LOGGING_FILE = "java.util.logging.config.file";

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

<<<<<<< HEAD
	public static void main(String[] args) {
		System.out.println(Paths.get(".").toFile().getAbsolutePath());
		SpringApplication.run(ZipkinDemoApplication.class, args);
=======
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
>>>>>>> 93ab5e56767d454b3655deb8b89b6c234e70124a
	}
	
}