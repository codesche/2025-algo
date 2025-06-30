package algo250701;

import java.util.*;

// 프로그래머스 - 최댓값과 최솟값 (Lv2)
public class Pro12939 {
    public String solution(String s) {
        String[] strArray = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String str : strArray) {
            int num = Integer.parseInt(str);        // 정수형 변환
            min = Math.min(num, min);               // 최솟값 비교
            max = Math.max(num, max);               // 최댓값 비교
        }

        sb.append(min).append(" ").append(max);

        return sb.toString();
    }

    public static void main(String[] args) {
        Pro12939 p = new Pro12939();
        System.out.println(p.solution("-4 -3 -2 -1"));
    }
}
