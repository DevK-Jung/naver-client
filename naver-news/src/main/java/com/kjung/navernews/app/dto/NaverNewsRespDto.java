package com.kjung.navernews.app.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class NaverNewsRespDto {
    private String lastBuildDate;
    private int total;
    private int start;
    private int display;
    private List<NewsItem> items;
}
