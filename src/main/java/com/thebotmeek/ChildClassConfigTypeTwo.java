package com.thebotmeek;

import io.micronaut.context.annotation.EachProperty;
import io.micronaut.context.annotation.Parameter;

@EachProperty("config.type-two")
public class ChildClassConfigTypeTwo extends AbstractClassConfig {
    ChildClassConfigTypeTwo(@Parameter String name) {
        super(name);
    }
}
