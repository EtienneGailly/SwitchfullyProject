package com.switchfully;

import com.switchfully.config.Parameters;
import com.switchfully.config.TestConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = TestConfig.class)
public class ParameterTest {

    @Autowired
    Parameters parameters;

    @Test
    void canReadNameParameter() {
        Assertions.assertThat(parameters.getName()).isEqualTo("Development App");
    }

    @Test
    void canReadAddressParameter() {
        Assertions.assertThat(parameters.getPassword()).isEqualTo("password");
    }

    @Test
    void canReadUrlParameter() {
        Assertions.assertThat(parameters.getUrl()).isEqualTo("http://development.switchfully.com");
    }
}
