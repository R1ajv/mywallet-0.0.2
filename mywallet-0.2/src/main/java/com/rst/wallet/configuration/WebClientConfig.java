package com.rst.wallet.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction;

@Configuration
public class WebClientConfig {
	
	@Bean
	public WebClient webClient(ClientRegistrationRepository clientRep, OAuth2AuthorizedClientRepository authClientRepo) {
		ServletOAuth2AuthorizedClientExchangeFilterFunction oauth2 =
				new ServletOAuth2AuthorizedClientExchangeFilterFunction(
						clientRep, 
						authClientRepo
						);
		oauth2.setDefaultClientRegistrationId("RajeevApp");
		return WebClient.builder().apply(oauth2.oauth2Configuration()).build();
	}
}