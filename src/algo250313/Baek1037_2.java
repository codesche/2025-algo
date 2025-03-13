package algo250313;

// 백준 - 약수
/*
양수 A가 N의 진짜 약수가 되려면,
N이 A의 배수이고,
A가 1과 N이 아니어야 한다.

어떤 수 N의 진짜 약수가 모두 주어질 때,
N을 구하는 프로그램 작성

 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek1037_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        bw.write(String.valueOf(arr[0] * arr[length - 1]));
        bw.flush();
        bw.close();
        br.close();
    }
}
