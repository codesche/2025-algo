package algo250426;

import java.io.*;

// 백준 - 계산기 프로그램 (브론즈 3)
public class Baek5613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        while (true) {
            String str = br.readLine();

            if (str.equals("=")) {
                break;
            }

            switch (str) {
                case "+":
                    total += Integer.parseInt(br.readLine());
                    break;
                case "-":
                    total -= Integer.parseInt(br.readLine());
                    break;
                case "*":
                    total *= Integer.parseInt(br.readLine());
                    break;
                case "/":
                    total /= Integer.parseInt(br.readLine());
                    break;
                default:
                    break;
            }
        }

        System.out.println(total);
    }
}
