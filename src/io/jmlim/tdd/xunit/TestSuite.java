package io.jmlim.tdd.xunit;

import org.springframework.core.annotation.AnnotationUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSuite implements Test {
    List<Test> tests = new ArrayList<>();

    public TestSuite(Class<? extends Test> testClass) {
        Arrays.stream(testClass.getMethods())
                .filter(m -> AnnotationUtils.findAnnotation(m, io.jmlim.tdd.xunit.annotation.Test.class) != null)
                .forEach(m -> {
                    try {
                        testClass.getConstructor(String.class).newInstance(m.getName());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    public TestSuite() {

    }

    public void run(TestResult result) {
        tests.forEach(t -> {
            t.run(result);
        });
    }

    public void add(Test test) {
        tests.add(test);
    }
}
