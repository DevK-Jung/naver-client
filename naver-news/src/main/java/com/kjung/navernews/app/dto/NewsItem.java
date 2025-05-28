package com.kjung.navernews.app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsItem {
    private String title;
    private String originallink;
    private String link;
    private String description;
    private String pubDate;
}
