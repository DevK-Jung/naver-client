package com.kjung.navernews.core.constants;

import lombok.Getter;

@Getter
public enum NaverApiHeadersKey {
    CLIENT_ID("X-Naver-Client-Id"),
    CLIENT_SECRET("X-Naver-Client-Secret");

    private final String key;

    NaverApiHeadersKey(String key) {
        this.key = key;
    }
}
