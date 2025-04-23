package algo250423;

import java.io.*;
import java.util.*;

// 백준 - 모바일 광고 입찰 (실버 5)
// i에 대해 MOLOCO가 제시한 입찰 가격 Ai, MOLOCO의 입찰가를 제외한 다른 모든 입찰가 중 최고 가격 Bi
// Ai: MOLOCO의 입찰 가격, Bi: MOLOCO의 입찰가 제외한 다른 모든 입찰가 중 최고 가격
// MOLOCO의 모든 입찰가를 일괄적으로 X만큼 올렸을 때 => Ai + X
// K개 이상의 지면을 낙찰받게 되는 가장 작은 음이 아닌 정수 X를 찾고자 한다.
// 같은 지면에 대해 MOLOCO의 입찰가와 다른 회사의 최고 입찰가가 같을 경우 MOLOCO가 낙찰받음
public class Baek31246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        // N개의 줄에 i에 대한 정보 Ai, Bi가 공백으로 구분되어 차례로 주어짐
        // arr: 현재 입찰가 차이 (현재 입찰 최고가 - 입찰가) 를 모아서 보관
        // arr를 정렬하면 입찰가 차이가 낮은 순서로 정렬되며 arr의 k번째 원소(입찰가 차이의 K번째 원소)
        // 까지 구매할 수 있어야 한다.
        // 최소입찰 금액이 음수일 수 없기애 Math.max(0, arr[K - 1] 로 최소가격은 0으로 출력해준다.
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int Ai = Integer.parseInt(st.nextToken());
            int Bi = Integer.parseInt(st.nextToken());
            arr[i] = Bi - Ai;
        }

        Arrays.sort(arr);

        System.out.println(Math.max(0, arr[K - 1]));
    }
}
