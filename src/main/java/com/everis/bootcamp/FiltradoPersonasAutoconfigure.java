package com.everis.bootcamp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(FiltradoPersonas.class)
@EnableConfigurationProperties(FiltradoPersonasProperties.class)
public class FiltradoPersonasAutoconfigure {
	
	private final FiltradoPersonasProperties properties;
	
	public FiltradoPersonasAutoconfigure(FiltradoPersonasProperties properties) {
		this.properties = properties;
	}
	
	@Bean
	public FiltradoPersonas cb() {
		return new FiltradoPersonas(properties.getTipoFiltrado());
	}

}
