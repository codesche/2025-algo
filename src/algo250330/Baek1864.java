package algo250330;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 백준 - 문어 숫자 (브론즈 2)
public class Baek1864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = {'-', '\\', '(', '@', '?', '>', '&', '%', '/'};
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, -1};

        while (true) {
            String str = br.readLine();

            // "#" 이면 break
            if (str.equals("#")) {
                break;
            }

            int length = str.length();
            double pow = length - 1;
            int sum = 0;
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (str.charAt(i) == arr[j]) {
                        sum += (int) (numArr[j] * Math.pow(8, pow));
                        pow--;
                    }
                }
            }

            System.out.println(sum);
        }
    }
}
