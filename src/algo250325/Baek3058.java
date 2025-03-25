package algo250325;

import java.io.*;
import java.util.StringTokenizer;

// 백준 - 짝수를 찾아라 (브론즈 3)
public class Baek3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // t번 순회
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] arr = new int[7];
            int sum = 0;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < 7; j++) {
                arr[j] = Integer.parseInt(st.nextToken());

                if (min > arr[j] && arr[j] % 2 == 0) {
                    min = arr[j];           // 최솟값 구분
                }

                // 짝수 구분 후 누적 합 구하기
                if (arr[j] % 2 == 0) {
                    sum += arr[j];
                }
            }

            System.out.println(sum + " " + min);
        }
    }

}
