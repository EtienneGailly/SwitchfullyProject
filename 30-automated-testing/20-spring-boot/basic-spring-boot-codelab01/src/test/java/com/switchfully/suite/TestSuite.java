package com.switchfully.suite;

import com.switchfully.suite.tests.SecondCounterTest;
import com.switchfully.suite.tests.FirstCounterTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        FirstCounterTest.class,
        SecondCounterTest.class
})
public class TestSuite {
}
