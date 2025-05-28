package com.kjung.navernews.core.property;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

@Getter
@Validated
@ConfigurationProperties(prefix = "infra.naver")
public class NaverNewsConfigProperty {
    @NotBlank(message = "baseUrl must not be blank")
    private final String baseUrl;
    @NotBlank(message = "clientId must not be blank")
    private final String clientId;
    @NotBlank(message = "clientSecret must not be blank")
    private final String clientSecret;

    @ConstructorBinding
    public NaverNewsConfigProperty(String baseUrl, String clientId, String clientSecret) {
        this.baseUrl = baseUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }
}
