package io.stricte.leetcode;

import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import lombok.Value;

public class LogTimeExclusiveTimeExecution {

  public int[] exclusiveTime(int n, List<String> logs) {
    if (null == logs || logs.isEmpty()) {
      return new int[0];
    }

    int[] ans = new int[n];
    Deque<int[]> q = new LinkedList<>();
    int gt = -1;

    for (String log : logs) {
      String[] s = log.split(":");
      int fun = Integer.parseInt(s[0]);
      String action = s[1];
      int time = Integer.parseInt(s[2]);

      if ('s' == action.charAt(0)) {
        int[] peek = q.peek();
        if (null != peek) {
          ans[peek[0]] += (time - gt);
        }
        q.push(new int[]{fun, time});
        gt = time;

      } else {
        int[] pop = q.pop();
        ans[pop[0]] += (time - gt + 1);
        gt = time + 1;
      }
    }
    return ans;
  }

  public Map<String, Integer> solution(Collection<Log> logs) {

    Map<String, Integer> ans = new HashMap<>();
    Deque<Log> q = new LinkedList<>();
    int time = -1;

    for (Log log : logs) {
      if (log.tag.charAt(0) == 's') {
        Log peek = q.peek();
        if (null != peek) {
          ans.merge(peek.name, log.time - peek.time, Integer::sum);
        }
        q.push(log);

      } else {
        Log pop = q.pop();

        ans.merge(pop.name, log.time - time, Integer::sum);
      }
      time = log.time;
    }
    return ans;
  }

  @Value
  public static class Log {

    String name;
    String tag;
    int time;

    public static Log start(String fun, int time) {
      return new Log(fun, "start", time);
    }

    public static Log end(String fun, int time) {
      return new Log(fun, "end", time);
    }
  }
}
