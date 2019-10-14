package com.milkz.picture.util;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class YmlConfig {

    @Value("${spring.picture.path:#{null}}")
    private String path;

}
