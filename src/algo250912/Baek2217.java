package algo250912;

import java.io.*;
import java.util.*;

// 백준 - 로프 (실버 4)
// k개 로프 사용 -> 중량 w인 물체 들어올릴 때, 각각의 로프에 w/k 만큼의 중량이 걸림
// 2개의 로프 - 10, 15 => 중량이 20인 물체 들어올림
public class Baek2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N개 로프 입력
        int N = Integer.parseInt(br.readLine());

        // 무게 배열 생성
        int[] w = new int[N];

        // k개 로프 사용 -> 모두 w/k 만큼 고르게 중량이 걸림
        // w/10, w/15 => 이 로프들을 이용하여 들어올릴 수 있는 물체의 최대 중량
        // 2개 로프 -> w/10 + w/15 = 2
        for (int i = 0; i < N; i++) {
            w[i] = Integer.parseInt(br.readLine());
        }

        // k개를 사용한다면 그 중, 최소 하중이 결과 결정
        // 가장 큰 k개를 쓰는 것이 최소 하중을 최대화함.
        // 구현은 오름차순 정렬 후, i번째(0-index) 로프를 "최소 하중"으로 봄...
        // 남은 개수를 N - i 로 계산
        Arrays.sort(w);

        long answer = 0;        // 오버플로 방지 위해 long으로 선언 (결과가 최대 10^9 까지 갈 수 있음을 고려)
        for (int i = 0; i < N; i++) {
            int minCapacity = w[i];         // 이 시점에 선택되는 로프들 중 최소 하중
            int count = N - i;              // 사용할 로프 개수
            long capacity = (long) minCapacity * count;
            if (capacity > answer) {
                answer = capacity;
            }
        }

        System.out.println(answer);
    }
}
