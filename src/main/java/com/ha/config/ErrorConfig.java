package com.ha.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Setter
@Getter
@ConfigurationProperties(prefix = "error")
@PropertySource("classpath:error.yml")
public class ErrorConfig {
	
//	private List<ErrorContent> codes = new ArrayList<>();
//	
//	@Data
//	public static class ErrorContent {
//		private String code;
//		private String content;
//	}
	
	public Map<Integer, String> codes = new HashMap<>();
	private String name;
}
