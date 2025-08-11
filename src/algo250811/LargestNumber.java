package algo250811;

import java.util.*;

// 가장 큰 수 만들기(정렬)
// 문자열 비교 a+b vs b+a. “000…”이면 “0” 반환.
public class LargestNumber {
    public static String build(int[] nums) {
        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(s, (a, b)
            -> (b + a).compareTo(a + b));

        if (s[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String x : s) {
            sb.append(x);
        }

        return sb.toString();
    }
}
