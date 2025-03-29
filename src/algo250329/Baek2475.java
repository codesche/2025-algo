package algo250329;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

// 백준 - 검증수 (브론즈 5)
public class Baek2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double total = 0.0;
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st.nextToken());
            total += Math.pow(num, 2);
        }

        System.out.println((int) total % 10);
    }
}
