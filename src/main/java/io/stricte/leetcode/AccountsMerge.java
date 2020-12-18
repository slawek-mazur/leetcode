package io.stricte.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class AccountsMerge {

  public List<List<String>> accountsMerge(List<List<String>> accounts) {

    List<List<String>> res = new ArrayList<>();
    if (null == accounts) {
      return res;
    }

    Map<String, Map<String, Set<String>>> map = new HashMap<>();
    for (List<String> emails : accounts) {
      if (null == emails || emails.isEmpty()) {
        continue;
      }

      String name = emails.get(0);
      Map<String, Set<String>> existing = new HashMap<>();
      existing.put(name, new TreeSet<>());
      List<Map<String, Set<String>>> existings = new ArrayList<>();
      // find existing
      for (int i = 1; i < emails.size(); i++) {
        if (null != map.get(emails.get(i))) {
          existings.add(map.get(emails.get(i)));
        }
      }
      // create new
      if (!existings.isEmpty()) {
        for (Map<String, Set<String>> ex : existings) {
          for (String mail : ex.get(name)) {
            map.put(mail, existing);
          }
          existing.get(name).addAll(ex.get(name));
        }
      }
      // complete
      for (int i = 1; i < emails.size(); i++) {
        String email = emails.get(i);
        map.put(email, existing);
        existing.get(name).add(email);
      }
    }

    Set<Set<String>> duplicates = new HashSet<>();
    for (Map<String, Set<String>> value : map.values()) {
      for (Entry<String, Set<String>> e : value.entrySet()) {
        if (!duplicates.contains(e.getValue())) {
          List<String> emails = new ArrayList<>();
          emails.add(e.getKey());
          emails.addAll(e.getValue());
          res.add(emails);
          duplicates.add(e.getValue());
        }
      }
    }

    return res;
  }
}
