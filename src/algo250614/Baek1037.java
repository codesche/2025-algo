package algo250614;

import java.io.*;
import java.util.*;

// 백준 - 약수 (브론즈 1)
// 진짜 약수의 개수, 양수 A가 진짜 약수가 되려면 N이 A의 배수이고 A가 1과 N이 아니어야 함
public class Baek1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        int[] arr = new int[C];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int answer = arr[0] * arr[C - 1];
        System.out.println(answer);
    }
}
