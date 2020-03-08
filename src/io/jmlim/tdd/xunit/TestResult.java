package io.jmlim.tdd.xunit;

public class TestResult {
    int runCount = 0;
    private int errorCount = 0;

    public void testStarted() {
        runCount++;
    }

    public String getSummary() {
        return runCount + " run, " + errorCount + " failed";
    }

    public void testFailed() {
        errorCount++;
    }
}
