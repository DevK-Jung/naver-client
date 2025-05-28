package com.kjung.navernews.core.config;

import com.kjung.navernews.core.property.NaverNewsConfigProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(NaverNewsConfigProperty.class)
public class NaverNewsConfig {
}
