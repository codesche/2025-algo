package algo250313;

// 백준 - 약수
/*
양수 A가 N의 진짜 약수가 되려면,
N이 A의 배수이고,
A가 1과 N이 아니어야 한다.

어떤 수 N의 진짜 약수가 모두 주어질 때,
N을 구하는 프로그램 작성

 */

import java.io.*;
import java.util.*;

public class Baek1037 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        answer = arr[0] * arr[length - 1];
        System.out.println(answer);
    }
}
