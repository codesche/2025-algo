package algo250409;

import java.io.*;
import java.util.*;

// 백준 - 홀짝 칵테일 (브론즈 3)
public class Baek21312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (A % 2 == 0 && B % 2 == 0 && C % 2 == 0) {
            System.out.println(A * B * C);
        } else {
            System.out.println(checkOddEven(A) * checkOddEven(B) * checkOddEven(C));
        }

    }

    public static int checkOddEven(int num) {
        if (num % 2 == 1) {
            return num;
        } else return 1;
    }

}
