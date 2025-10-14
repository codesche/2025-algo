package algo251014;

import java.io.*;
import java.util.*;

// 백준 - 좌표 압축 (실버 2)
// 원본 보존 + 정렬 준비       | O(N)       |
// 좌표 간 크기 비교를 위해      | O(N log N) |
// HashMap으로 값 → 순위 저장 | O(N)       |
// 원본 순서대로 매핑된 값 출력    | O(N)       |
public class Baek18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();         // 출력 성능 향상을 위한 StringBuilder

        // 입력: 전체 숫자의 개수 N
        int N = Integer.parseInt(br.readLine());

        // 입력: N개의 좌표값
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 원본 배열 복사 - 정렬 배열로 사용
        // 정렬 통해 좌표의 상대적 순서 확인
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        // 값 -> 압축된 좌표를 저장할 HashMap
        // 초기 용량을 N * 2로 넉넉히 잡아 성능 최적화 (리사이징 방지)
        Map<Integer, Integer> rank = new HashMap<>(N * 2);

        // 압축 좌표(랭크)로 쓸 인덱스 변수
        int idx = 0;

        // 직전 값과 비교하기 위한 변수
        int prev = Integer.MIN_VALUE;

        // 첫 번째 값은 무조건 처리하기 위한 플래그
        boolean first = true;

        // 정렬된 배열 순회하며 새로운 값이 나올 때마다 인덱스를 1씩 증가시켜서 매핑
        for (int x : sorted) {
            if (first || x != prev) {
                // 해당 값에 현재 인덱스를 매핑
                rank.put(x, idx++);

                // prev를 현재 값으로 갱신
                prev = x;

                // 첫 번째 값 처리가 끝났으니 false로 변경
                first = false;
            }
        }

        // 원래 입력 순서대로 각 값의 압축 좌표를 꺼내 출력
        for (int i = 0; i < N; i++) {
            sb.append(rank.get(arr[i])).append(' ');
        }

        System.out.println(sb);
    }
}
