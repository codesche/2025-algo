package algo250426;

import java.io.*;

// 문자열 압축 - 같은 문자가 연속으로 반복되는 것을 숫자와 함께 표현
// aabbaccc
public class CoTeEx1 {
    public int solution(String s) {
        int answer = s.length();            // 최악의 경우 (압축 불가)

        for (int step = 1; step <= s.length() / 2; step++) {
            StringBuilder sb = new StringBuilder();
            String prev = s.substring(0, step);
            int count = 1;

            for (int j = step; j < s.length(); j += step) {
                // 다음 블록
                String current = "";
                if (j + step <= s.length()) {
                    current = s.substring(j, j + step);
                } else {
                    current = s.substring(j);
                }

                if (prev.equals(current)) {
                    count++;
                } else {
                    // 압축 추가
                    if (count >= 2) {
                        sb.append(count);
                    }
                    sb.append(prev);
                    prev = current;
                    count = 1;
                }
            }

            // 마지막 남은 문자열 처리
            if (count >= 2) {
                sb.append(count);
            }

            sb.append(prev);

            // 가장 짧은 압축 길이 갱신
            answer = Math.min(answer, sb.length());
        }

        return answer;
    }

    public static void main(String[] args) {
        CoTeEx1 T = new CoTeEx1();
        System.out.println(T.solution("aabbaccc"));
    }

}
