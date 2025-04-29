package com.thebotmeek;

import io.micronaut.context.annotation.EachProperty;
import io.micronaut.context.annotation.Parameter;

@EachProperty("config.type-one")
public class ChildClassConfigTypeOne extends AbstractClassConfig {
    ChildClassConfigTypeOne(@Parameter String name) {
        super(name);
    }
}
