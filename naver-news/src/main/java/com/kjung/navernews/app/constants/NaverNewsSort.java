package com.kjung.navernews.app.constants;

import lombok.Getter;

@Getter
public enum NaverNewsSort {
    SIM("sim"), // 정확도순으로 내림차순 정렬(기본값)
    DATE("date"); // 날짜순으로 내림차순 정렬

    private final String code;

    NaverNewsSort(String code) {
        this.code = code;
    }
}
