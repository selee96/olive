package com.example.olive.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_NOT_FOUND("사용자가 없습니다."),
    PRODUCT_NOT_FOUND("상품이 없습니다.");

    private final String description;
}
