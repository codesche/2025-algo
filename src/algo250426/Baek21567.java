package algo250426;

import java.io.*;

// 백준 - 숫자의 개수 2 (브론즈 2)
public class Baek21567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long A = Long.parseLong(br.readLine());
        long B = Long.parseLong(br.readLine());
        long C = Long.parseLong(br.readLine());

        int[] arr = new int[10];
        long length = String.valueOf(A * B * C).length();

        // 17037300
        char[] numbers = String.valueOf(A * B * C).toCharArray();

        for (int i = 0; i < length; i++) {
            arr[numbers[i] - '0']++;            // '0'을 붙여야 정확하게 배열 요소에 추가됨
        }

        for (int number : arr) {
            System.out.println(number);
        }
    }
}
