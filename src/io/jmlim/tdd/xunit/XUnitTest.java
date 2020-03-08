package io.jmlim.tdd.xunit;

public class XUnitTest {
    public static void main(String[] args) {
/*        TestResult result = new TestResult();
        new TestCaseTest("testTemplateMethod").run(result);
        new TestCaseTest("testResult").run(result);
        new TestCaseTest("testFailedResultFormatting").run(result);
        new TestCaseTest("testFailedResult").run(result);
        new TestCaseTest("testSuite").run(result);

        System.out.println(result.getSummary());*/

       /* TestSuite suite = TestCaseTest.suite();
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println(result.getSummary());

        TestSuite suite2 = new TestSuite();
        suite2.add(new TestCaseTest("testTemplateMethod"));
        suite2.add(suite);
        suite2.add(suite);
        suite2.add(suite);
        TestResult result2 = new TestResult();
        suite2.run(result2);
        System.out.println(result2.getSummary());*/

        TestSuite suite = TestCaseTest.suite();
        suite.add(new TestCaseTest("testTemplateMethod"));
        suite.add(new TestCaseTest("testTemplateMethod"));
        suite.add(new TestCaseTest("testTemplateMethod"));
        suite.add(new TestCaseTest("testTemplateMethod"));
        suite.add(new TestCaseTest("testTemplateMethod"));
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println(result.getSummary());
    }
}
