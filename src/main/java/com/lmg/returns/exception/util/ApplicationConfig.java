package com.lmg.returns.exception.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="app")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ApplicationConfig {

    private String customerOrderURI;
    private String customerReturnOrderURI;
    private Set<String> returnOrderSourceType;

}
