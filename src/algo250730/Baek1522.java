package algo250730;

import java.io.*;

// 백준 - 문자열 교환 (실버 1)
// 문자열이 원형이라는 가정 => 기존 문자열의 2배를 곱해주는 형태로 진행
/**
 * 문자열이 원형 - 처음과 끝은 서로 인접해 있음
 */

public class Baek1522 {
    public static void main(String[] args) throws IOException {
        // 문자열 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 총 a의 길이를 구한다.
        int aCount = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a') {
                aCount++;
            }
        }

        // 문자열을 2배로 만들어 원형처럼 처리
        String doubleStr = str + str;

        int bCount = 0;
        // 초기 윈도우 설정
        for (int i = 0; i < aCount; i++) {
            if (doubleStr.charAt(i) == 'b') {
                bCount++;
            }
        }

        int min = bCount;

        // 슬라이딩 윈도우 적용
        for (int i = 1; i < str.length(); i++) {
            // 이전 문자가 b였으면 윈도우에서 빠짐
            if (doubleStr.charAt(i - 1) == 'b') {
                bCount--;
            }

            // ex. 1 + 5 - 1(5), 2 + 5 - 1(6),
            if (doubleStr.charAt(i + aCount - 1) == 'b') {
                bCount++;
            }

            min = Math.min(min, bCount);
        }

        System.out.println(min);
    }
}
