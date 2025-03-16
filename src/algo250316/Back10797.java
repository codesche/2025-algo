package algo250316;

// 백준 - 10부제 (브론즈 4)

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(br.readLine());        // N 입력

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int answer = 0;                                 // 일치하는 숫자 확인
        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(st.nextToken());

            // 숫자 일치 여부 확인
            if (number == day) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
