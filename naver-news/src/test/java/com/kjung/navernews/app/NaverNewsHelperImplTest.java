package com.kjung.navernews.app;

import com.kjung.httpclient.restClient.RestClientHelper;
import com.kjung.navernews.app.dto.NaverNewsReqDto;
import com.kjung.navernews.app.dto.NaverNewsRespDto;
import com.kjung.navernews.core.config.NaverNewsConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@ContextConfiguration(classes = {
        NaverNewsConfig.class,
        NaverNewsHelperImpl.class,
        RestClientHelper.class
})
@TestPropertySource(properties = {
        "infra.naver.base-url=https://openapi.naver.com",
        "infra.naver.client-secret=",
        "infra.naver.client-id=",
})
class NaverNewsHelperImplTest {

    @Autowired
    NaverNewsHelperImpl helper;

    @Test
    void getNews() {

        String query = "AI";

        NaverNewsRespDto news = helper.getNews(NaverNewsReqDto.withQuery(query));

        Assertions.assertThat(news).isNotNull();
    }
}