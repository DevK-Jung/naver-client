package com.kjung.navernews.app.dto;

import com.kjung.navernews.app.constants.NaverNewsSort;
import io.micrometer.common.util.StringUtils;
import lombok.Getter;

import java.util.LinkedHashMap;
import java.util.Map;

@Getter
public class NaverNewsReqDto {
    private final String query; // 검색어. UTF-8로 인코딩되어야 합니다.
    private final Integer display; // 한 번에 표시할 검색 결과 개수(기본값: 10, 최댓값: 100)
    private final Integer start; // 검색 시작 위치(기본값: 1, 최댓값: 1000)
    private final String sort; // 검색 결과 정렬 방법 - sim: 정확도순으로 내림차순 정렬(기본값) - date: 날짜순으로 내림차순 정렬

    private NaverNewsReqDto(String query, Integer display, Integer start, String sort) {
        if (StringUtils.isBlank(query))
            throw new IllegalArgumentException("query는 필수입니다.");

        this.query = query;
        this.display = display;
        this.start = start;
        this.sort = sort;
    }

    public static NaverNewsReqDto withQuery(String query) {
        return new NaverNewsReqDto(query, null, null, null);
    }

    public static NaverNewsReqDto of(String query,
                                     Integer display,
                                     Integer start,
                                     NaverNewsSort sort) {
        return new NaverNewsReqDto(query, display, start, sort.getCode());
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();

        map.put("query", query);

        if (display != null)
            map.put("display", display);

        if (start != null)
            map.put("start", start);

        if (StringUtils.isNotBlank(sort))
            map.put("sort", sort);

        return map;
    }
}
