package com.kjung.navernews.app;


import com.kjung.navernews.app.dto.NaverNewsReqDto;
import com.kjung.navernews.app.dto.NaverNewsRespDto;

public interface NaverNewsHelper {
    NaverNewsRespDto getNews(NaverNewsReqDto param);
}
