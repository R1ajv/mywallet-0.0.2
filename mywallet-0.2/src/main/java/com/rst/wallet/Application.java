package com.rst.wallet;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.rst.wallet.model.Customer;
import com.rst.wallet.repository.CustomerRepository;

@SpringBootApplication
@ComponentScan(basePackages="com.rst.wallet")
public class Application {

	@Autowired
	CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}
	
	

	/*
	 * @Bean public ServletWebServerFactory servletContainer() {
	 * TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
	 * 
	 * @Override protected void postProcessContext(Context context) {
	 * SecurityConstraint securityConstraint = new SecurityConstraint();
	 * securityConstraint.setUserConstraint("CONFIDENTIAL"); SecurityCollection
	 * collection = new SecurityCollection(); collection.addPattern("/*");
	 * securityConstraint.addCollection(collection);
	 * context.addConstraint(securityConstraint); } };
	 * tomcat.addAdditionalTomcatConnectors(redirectConnector()); return tomcat; }
	 * 
	 * private Connector redirectConnector() { Connector connector = new
	 * Connector("org.apache.coyote.http11.Http11NioProtocol");
	 * connector.setScheme("http"); connector.setPort(8081);
	 * connector.setRedirectPort(8443); return connector; }
	 */
}
