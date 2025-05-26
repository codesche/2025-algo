package algo250526;

import java.io.*;
import java.util.*;

// 백준 - 0의 개수 (브론즈 1)
// N부터 M까지의 수들을 종이에 적었을 때 종이에 적힌 0들을 세는 프로그램 작성
public class Baek11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());       // N 입력 - 0
            int M = Integer.parseInt(st.nextToken());       // M 입력 - 10

            // 0을 찾은 개수를 카운팅해야 함 (count)
            int count = 0;
            for (int j = N; j <= M; j++) {
                String str = String.valueOf(j);
                for (int k = 0; k < str.length(); k++) {
                    if (str.charAt(k) == '0') {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
