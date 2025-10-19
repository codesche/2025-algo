package algo251019;

import java.io.*;

// 백준 - Parking Pandemonium (브론즈 5)
public class Baek34297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        // 총 소요 시간
        long total = (long) M * C;

        System.out.println(total);
    }
}
