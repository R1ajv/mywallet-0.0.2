package com.rst.wallet.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().oauth2Login();
	}

	/*
	 * private ClientRegistration clientRegistration() { return
	 * CommonOAuth2Provider.GITHUB.getBuilder("github").clientId(
	 * "6acc0802574d5b821f11")
	 * .clientSecret("190e1a711bcb7f93c8ea39040d448286e36ce1fe").build(); }
	 */

	/*
	 * @Bean public ClientRegistrationRepository clientRepository() {
	 * ClientRegistration clientReg = clientRegistration(); return new
	 * InMemoryClientRegistrationRepository(clientReg); }
	 */
	
	/*
	 * private ClientRegistration clientRegistration() { ClientRegistration cr =
	 * ClientRegistration.withRegistrationId("github").clientId(
	 * "6acc0802574d5b821f11")
	 * .clientSecret("190e1a711bcb7f93c8ea39040d448286e36ce1fe").scope(new String[]
	 * { "read:user" }) .authorizationUri("http://github.com/login/oauth/authorize")
	 * .tokenUri("https://github.com/login/oauth/access_token").userInfoUri(
	 * "https://api.github.com/user")
	 * .userNameAttributeName("id").clientName("GitHub")
	 * .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
	 * .redirectUriTemplate("{baseUrl}/{action}/oauth2/code/{registrationId}").build
	 * (); return cr; }
	 */

	
	
}