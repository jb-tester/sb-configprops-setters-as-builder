package com.mytests.sbConfigPropsSettersAsBuilder;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.nolombok.props")
public class NoLombokProps {


    /**
     * string prop without lombok
     */
    String prop0;

    /**
     * boolean prop without lombok
     */
    boolean prop3;

    NestedPojo nestedPojo;

    public String getProp0() {
        return prop0;
    }

    public NoLombokProps setProp0(String prop0) {
        this.prop0 = prop0;
        return this;
    }

    public NoLombokProps setProp3(boolean prop3) {
        this.prop3 = prop3;
        return this;
    }

    public boolean isProp3() {
        return prop3;
    }

    public NestedPojo getNestedPojo() {
        return nestedPojo;
    }

    public NoLombokProps setNestedPojo(NestedPojo nestedPojo) {
        this.nestedPojo = nestedPojo;
        return this;
    }

    static class NestedPojo{

        String innerProp;

        public String getInnerProp() {
            return innerProp;
        }

        public NestedPojo setInnerProp(String innerProp) {
            this.innerProp = innerProp;
            return this;
        }
    }
}
