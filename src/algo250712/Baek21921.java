package algo250712;

import java.io.*;
import java.util.*;
import java.util.stream.*;

// 백준 - 블로그 (실버 3)
public class Baek21921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {       // 1 4 2 5 1 (1일차 2일차 3일차 4일차 5일차)
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 슬라이딩 윈도우의 횟수
        int count = N - X + 1;

        int start = 0;              // start를 +1만큼 증가
        int end = X - 1;            // end를 +1만큼 증가

        // 누적 합 배열 선언
        int[] totalArr = new int[count + 1];
        int idx = 1;
        while (count != 0) {
            totalArr[idx] = IntStream.rangeClosed(start, end).map(i -> arr[i]).sum();       // 시간 초과 발생
            idx++;
            start++;
            end++;
            count--;
        }

        Arrays.sort(totalArr);

        long maxCount = Arrays.stream(totalArr).max().getAsInt() == 0 ?
            0 : IntStream.of(totalArr).max().stream().count();
        int max = Arrays.stream(totalArr).max().getAsInt();

        sb.append(maxCount != 0 ? max + "\n" + maxCount : "SAD");
        System.out.println(sb);
    }
}
