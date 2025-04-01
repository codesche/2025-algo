package algo250401;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 백준 - 공백없는 A + B (브론즈 4)
// 자연수 A, B (0 < A, B ≤ 10)
public class Baek15873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int length = String.valueOf(number).length();
        int answer = 0;

        if (length == 2) {
            answer = (number / 10) + (number % 10);
        } else if (length == 3) {       // 810, 108
            String str = String.valueOf(number);

            if (Integer.parseInt(str.substring(0, 2)) == 10) {
                answer = Integer.parseInt(str.substring(0, 2)) + Integer.parseInt(str.substring(2));
            } else if (Integer.parseInt(str.substring(1, 3)) == 10) {
                answer = Integer.parseInt(str.substring(0, 1)) + Integer.parseInt(str.substring(1, 3));
            }

        } else if (length == 4) {
            answer = 20;
        }

        System.out.println(answer);
    }
}
