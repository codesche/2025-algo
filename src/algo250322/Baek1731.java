package algo250322;

// 백준 - 추론 (브론즈 2)
// 등차인지, 등비인지 판별해주는 로직만 구성해주면 됨

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Baek1731 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int temp = 0;                               // 공차 or 공비 역할 변수
        int answer = 0;
        if (arr[1] % arr[0] == 0) {
            temp = arr[1] / arr[0];
            answer = arr[n - 1] * temp;
        } else {
            temp = arr[1] - arr[0];
            answer = arr[n - 1] + temp;
        }

        System.out.println(answer);
    }
}
