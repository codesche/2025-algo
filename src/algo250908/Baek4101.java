package algo250908;

import java.util.*;
import java.io.*;

// 백준 - 크냐? (브론즈 5)
public class Baek4101 {

    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 출력
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스 확인
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            // 0 0 입력 시 종료
            if (N == 0 && M == 0) {
                break;
            }

            if (N > M) {
                sb.append("Yes").append('\n');
            } else {
                sb.append("No").append('\n');
            }
        }

        System.out.println(sb);
    }

}
