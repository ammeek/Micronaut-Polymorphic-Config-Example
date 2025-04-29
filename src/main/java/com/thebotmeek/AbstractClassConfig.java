package com.thebotmeek;

import io.micronaut.context.annotation.EachProperty;
import io.micronaut.context.annotation.Parameter;

public abstract class AbstractClassConfig implements ConfigInterface {
    private  String interfaceConfig;
    private String name;

    AbstractClassConfig(@Parameter String name) {
        this.name = name;
    }

    @Override
    public String getInterfaceConfig() {
        return this.interfaceConfig;
    }

    public void setInterfaceConfig(String interfaceConfig) {
        this.interfaceConfig = interfaceConfig;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClassConfigInterface{");
        sb.append("interfaceConfig='").append(interfaceConfig).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
