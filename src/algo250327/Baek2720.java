package algo250327;

import java.io.*;

// 백준 - 세탁소 사장 동혁 (브론즈 3)
public class Baek2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int C = Integer.parseInt(br.readLine());

            int quarter = C / 25;
            C %= 25;

            int dime = C / 10;
            C %= 10;

            int nickel = C / 5;
            C %= 5;

            int penny = C;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
