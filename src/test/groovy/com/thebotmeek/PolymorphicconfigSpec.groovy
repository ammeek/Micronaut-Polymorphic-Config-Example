package com.thebotmeek

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import jakarta.inject.Inject

@MicronautTest
class PolymorphicconfigSpec extends Specification {

    @Inject
    Map<String, ConfigInterface> configInterfaceMap;

    void 'expect two beans of ConfigInterface to be present'() {
        expect:
        assert configInterfaceMap.size() == 2
    }

    void 'expect ConfigInterface bean with qualifier default-one to have config value of iAMDefaultConfigForTypeOne'() {
        expect:
        assert configInterfaceMap.get("default-one").getInterfaceConfig() == "iAMDefaultConfigForTypeOne"
    }

    void 'expect ConfigInterface bean with qualifier default-two to have config value of iAMDefaultConfigForTypeTwo'() {
        expect:
        assert configInterfaceMap.get("default-one").getInterfaceConfig() == "iAMDefaultConfigForTypeOne"
    }
}
