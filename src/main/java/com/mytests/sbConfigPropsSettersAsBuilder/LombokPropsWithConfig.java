package com.mytests.sbConfigPropsSettersAsBuilder;

import org.springframework.stereotype.Component;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("my.lombokconfig")
@Component
public class LombokPropsWithConfig {
    String prop;
}
