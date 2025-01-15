package algo250115;

import java.util.*;
import java.io.*;

// 숫자의 합 - 브론즈 4
public class Baek11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        // 0은 더하지 않고 pass하기
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (str.charAt(i) == '0') {
                continue;
            } else {
                sum += Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.print(sum);
    }
}
