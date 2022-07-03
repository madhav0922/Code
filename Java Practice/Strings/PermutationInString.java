package Strings;

import java.util.*;

public class PermutationInString {
    public static HashMap<String, Integer> computeCount(String sample) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < sample.length(); i++) {
            hm.computeIfPresent("" + sample.charAt(i), (k, v) -> v++);
            hm.putIfAbsent("" + sample.charAt(i), 1);
        }
        return hm;
    }

    public static Boolean isSameHashMapCount(HashMap<String, Integer> hm1, HashMap<String, Integer> hm2) {
        Boolean flag = true;
        for (String key : hm1.keySet()) {
            if (hm2.containsKey(key)) {
                if (hm2.get(key).intValue() != hm1.get(key).intValue()) {
                    flag = false;
                    break;
                }
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        HashMap<String, Integer> partCount = new HashMap<>();
        HashMap<String, Integer> windowCount = new HashMap<>();

        partCount = computeCount(s1);

        System.out.println(partCount);

        for (int i = 0; i < s2.length(); i++) {
            String subStr = s2.substring(i, i + s1.length());
            windowCount.clear();
            windowCount = computeCount(subStr);
            Boolean res = isSameHashMapCount(windowCount, partCount);
            if (res) {
                System.out.println(res);
                System.out.println(windowCount);
                System.out.println(partCount);
                break;
            }
        }
    }
}
