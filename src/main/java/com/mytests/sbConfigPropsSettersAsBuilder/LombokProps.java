package com.mytests.sbConfigPropsSettersAsBuilder;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@Accessors(chain = true)
@Component
@ConfigurationProperties("my.lombok.props")
public class LombokProps {
    /**
     * string prop1: lombok, annotation
     */
    String prop1;

    /**
     * int number1:  lombok, annotation
     */
    int number2;

    /**
     * nested enum:  lombok, annotation
     */
    NestedEnum nestedEnum;

    enum NestedEnum {first, second, third}
}
