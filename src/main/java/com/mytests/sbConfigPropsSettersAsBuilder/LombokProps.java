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
     * prop 1 is a string setting
     */
    String prop1;

    /**
     * number 2 is a number setting
     */
    int number2;

    /**
     * This setting which controls the speed of execution
     */
    NestedEnum nestedEnum;

    enum NestedEnum {first, second, third}
}
