package io.stricte.leetcode;

import io.stricte.leetcode.LogTimeExclusiveTimeExecution.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.Test;

class LogTimeExclusiveTimeExecutionTest {

  @Test
  void testSolution() {

    LogTimeExclusiveTimeExecution execution = new LogTimeExclusiveTimeExecution();

    Collection<Log> logs = new ArrayList<>();
    logs.add(Log.start("foo", 1));
    logs.add(Log.start("bar", 5));
    logs.add(Log.start("baz", 7));
    logs.add(Log.end("baz", 19));
    logs.add(Log.end("bar", 20));
    logs.add(Log.end("foo", 25));

    System.out.println(execution.solution(logs));
  }

  @Test
  void testExclusiveTime() {

    LogTimeExclusiveTimeExecution execution = new LogTimeExclusiveTimeExecution();

    int[] res = execution.exclusiveTime(2, Arrays.asList("0:start:0", "1:start:2", "1:end:5", "0:end:6"));
    System.out.println(Arrays.toString(res));

    int[] res2 = execution.exclusiveTime(1, Arrays.asList("0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7"));
    System.out.println(Arrays.toString(res2));
  }
}