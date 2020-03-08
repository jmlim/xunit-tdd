package io.jmlim.tdd.xunit;

import java.lang.reflect.Method;

public class TestCase implements Test {
    private final String name;

    public TestCase(String testMethod) {
        this.name = testMethod;
    }

    public void run(TestResult result) {
        result.testStarted();
        setUp();

        try {
            Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (Exception e) {
        //    throw new RuntimeException(e);
            result.testFailed();
        }

        tearDown();
    }

    public void tearDown() {
    }

    public void setUp() {

    }
}
