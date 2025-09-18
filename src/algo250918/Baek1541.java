package algo250918;

import java.io.*;
import java.util.*;

// 백준 - 잃어버린 괄호 (실버 2)
public class Baek1541 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer subtract = new StringTokenizer(br.readLine(), "-");
        int sum = Integer.MAX_VALUE;

        while (subtract.hasMoreTokens()) {
            int tmp = 0;

            StringTokenizer add = new StringTokenizer(subtract.nextToken(), "+");

            // 덧셈으로 구분한 토큰들을 모두 더해줌
            while (add.hasMoreTokens()) {
                tmp += Integer.parseInt(add.nextToken());
            }

            // 첫 번째 토큰인 경우
            if (sum == Integer.MAX_VALUE) {
                sum = tmp;
            } else {
                sum -= tmp;
            }
        }

        System.out.println(sum);
    }
}
