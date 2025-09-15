package algo250915;

import java.io.*;
import java.util.*;

// 백준 - 통계학 (실버 2)
public class Baek2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // N개 입력
        int[] arr = new int[N];
        long sum = 0;

        // 값의 범위 (-4000 ~ 4000) -> 0 ~ 8000 로 매핑
        int[] freq = new int[8001];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            freq[arr[i] + 4000]++;
        }

        // 정렬 (O log N)
        Arrays.sort(arr);

        // 산술평균: N개의 수들의 합을 N으로 나눈 값
        int mean = (int) Math.round((double) sum / N);

        // 중앙값: N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
        int median = arr[N / 2];

        // 최빈값: N개의 수들 중 가장 많이 나타나는 값
        // 여러 개 있는 경우 최빈값 중 두 번째로 작은 값을 출력
        int maxFreq = 0;
        for (int f : freq) {
            if (f > maxFreq) {
                maxFreq = f;
            }
        }

        // 최빈 후보들을 오름차순으로 수집
        int count = 0;
        int freqValue = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) {
                int value = i - 4000;
                count++;
                freqValue = value;
                if (count == 2) {       // 두 번째로 작은 값에서 멈춤
                    break;
                }
            }
        }

        // 범위: N개의 수들 중 최댓값과 최솟값의 차이
        int range = arr[N - 1] - arr[0];

        // 출력 (문제 요구 순서대로)
        StringBuilder sb = new StringBuilder();
        sb.append(mean).append('\n');
        sb.append(median).append('\n');
        sb.append(freqValue).append('\n');
        sb.append(range).append('\n');

        System.out.print(sb);
    }

}
