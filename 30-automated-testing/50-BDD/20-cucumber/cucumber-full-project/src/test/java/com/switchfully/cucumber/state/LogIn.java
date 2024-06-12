package com.switchfully.cucumber.state;

import com.switchfully.cucumber.data.Register;
import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class LogIn {

    private Register register;

    public void setRegister(Register register) {
        this.register = register;
    }

    public Register getRegister() {
        return register;
    }
}
