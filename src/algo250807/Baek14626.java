package algo250807;

import java.io.*;

// 백준 - ISBN (브론즈 1)
// (a+3b+c+3d+e+3f+g+3h+i+3j+k+3l+m) % 10 == 0
// m = 10 - (a+3b+c+3d+e+3f+g+3h+i+3j+k+3l) % 10
/*
홀수 - 그대로
짝수 - 3을 곱함
 */
// String str = 9788968322*73
public class Baek14626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int missingIndex = str.indexOf('*');
        int sum = 0;

        for (int i = 0; i < 13; i++) {
            if (i == missingIndex) continue;

            int digit = str.charAt(i) - '0';
            if (i % 2 == 0) {
                sum += digit;
            } else {
                sum += digit * 3;
            }
        }

        for (int i = 0; i <= 9; i++) {
            int tempSum = sum;

            if (missingIndex % 2 == 0) {
                tempSum += i;
            } else {
                tempSum += i * 3;
            }

            if (tempSum % 10 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
