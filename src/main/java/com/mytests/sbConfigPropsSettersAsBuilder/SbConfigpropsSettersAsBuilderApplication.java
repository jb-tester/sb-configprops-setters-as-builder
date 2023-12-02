package com.mytests.sbConfigPropsSettersAsBuilder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbConfigpropsSettersAsBuilderApplication implements CommandLineRunner {

    private final NoLombokProps noLombokProps;
    private final LombokProps lombokProps;
    private final LombokPropsWithConfig lombokPropsWithConfig;

    public SbConfigpropsSettersAsBuilderApplication(NoLombokProps noLombokProps, LombokProps lombokProps, LombokPropsWithConfig lombokPropsWithConfig) {
        this.noLombokProps = noLombokProps;
        this.lombokProps = lombokProps;
        this.lombokPropsWithConfig = lombokPropsWithConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(SbConfigpropsSettersAsBuilderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********************************");
        System.out.println("no lombok str:"+noLombokProps.getProp0());
        System.out.println("no lombok nested pojo:"+noLombokProps.getNestedPojo().getInnerProp());
        System.out.println("lombok annotation str:"+lombokProps.getProp1());
        System.out.println("lombok annotation enum:"+lombokProps.getNestedEnum());
        System.out.println("lombok config str:"+lombokPropsWithConfig.getProp());
        System.out.println("**********************************");
    }
}
