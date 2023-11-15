package com.example.thymeleaf.entity.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SensitiveDataUtil {

    public static String mask(String value) {
        if (value == null) {
            return null;
        }
        return "*".repeat(value.length());
    }
}
