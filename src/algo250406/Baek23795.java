package algo250406;

import java.io.*;

// 백준 - 사장님 도박은 재미로 하셔야 합니다 (브론즈 4)
public class Baek23795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
            int money = Integer.parseInt(br.readLine());

            if (money == -1) {
                break;
            }

            sum += money;
        }

        System.out.println(sum);
    }
}
