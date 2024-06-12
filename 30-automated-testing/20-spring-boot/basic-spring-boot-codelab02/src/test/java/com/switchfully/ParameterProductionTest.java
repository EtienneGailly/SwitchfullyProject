package com.switchfully;

import com.switchfully.config.Parameters;
import com.switchfully.config.TestConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = TestConfig.class)
@ActiveProfiles("Production")
public class ParameterProductionTest {

    @Autowired
    Parameters parameters;

    @Test
    void canReadNameParameter() {
        Assertions.assertThat(parameters.getName()).isEqualTo("Production App");
    }

    @Test
    void canReadAddressParameter() {
        Assertions.assertThat(parameters.getPassword()).isEqualTo("VeryS#cr3t!");
    }

    @Test
    void canReadUrlParameter() {
        Assertions.assertThat(parameters.getUrl()).isEqualTo("http://switchfully.com");
    }
}
