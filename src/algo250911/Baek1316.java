package algo250911;

import java.io.*;

// 백준 - 그룹 단어 체커 (실버 5)
public class Baek1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 단어 N개 입력
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            String words = br.readLine();               // 단어 입력

            if (checked(words)) {
                answer++;
            }
        }

        System.out.println(answer);
    }

    private static boolean checked(String words) {
        boolean[] check = new boolean[26];

        // 이전 문자 확인
        int prev = 0;

        // 문자열 길이
        int length = words.length();

        for (int i = 0; i < length; i++) {
            int cur = words.charAt(i);              // 아스키 코드로 저장

            if (prev != cur) {
                if (!check[cur - 'a']) {            // 해당 문자가 존재하지 않는 경우
                    check[cur - 'a'] = true;
                    prev = cur;                     // 다음 문자 확인을 위해
                } else {
                    return false;                   // 해당 문자가 존재하는 경우
                }
            }
        }

        return true;
    }
}
