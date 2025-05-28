package com.kjung.navernews.core.util;

import com.kjung.navernews.core.constants.NaverApiHeadersKey;
import lombok.experimental.UtilityClass;
import org.springframework.http.HttpHeaders;

import java.net.URI;

@UtilityClass
public class NaverApiReqUtil {
    public String getUrl(String baseUrl, String endpoint) {
        if (!baseUrl.endsWith("/"))
            baseUrl += "/";

        return URI.create(baseUrl).resolve(endpoint.startsWith("/") ? endpoint.substring(1) : endpoint).toString();
    }


    public HttpHeaders getAuthHeaders(String clientId, String clientSecret) {
        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.set(NaverApiHeadersKey.CLIENT_ID.getKey(), clientId);
        httpHeaders.set(NaverApiHeadersKey.CLIENT_SECRET.getKey(), clientSecret);

        return httpHeaders;
    }
}
