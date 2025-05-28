package com.kjung.navernews.app;

import com.kjung.httpclient.restClient.RestClientHelper;
import com.kjung.navernews.app.dto.NaverNewsReqDto;
import com.kjung.navernews.app.dto.NaverNewsRespDto;
import com.kjung.navernews.core.property.NaverNewsConfigProperty;
import com.kjung.navernews.core.util.NaverApiReqUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NaverNewsHelperImpl implements NaverNewsHelper {

    private final RestClientHelper clientHelper;

    private final NaverNewsConfigProperty property;

    @Override
    public NaverNewsRespDto getNews(NaverNewsReqDto param) {

        String requestUrl = NaverApiReqUtil.getUrl(property.getBaseUrl(), "/v1/search/news.json");

        HttpHeaders headers = NaverApiReqUtil.getAuthHeaders(property.getClientId(), property.getClientSecret());

        return clientHelper.get(
                requestUrl
                , headers
                , param.toMap()
                , NaverNewsRespDto.class
        );
    }
}
