package algo250907;

import java.io.*;
import java.util.*;

// 백준 - 회전 초밥 (골드 4)
public class Baek15961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N: 벨트 위 접시 수, d: 초밥의 가짓수, k: 연속해서 먹을 접시 수, c: 쿠폰 번호
        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 벨트 위의 초밥 종류 배열 (길이 N)
        // i번째 접시는 belt[i] 종류의 초밥
        int[] belt = new int[N];
        for (int i = 0; i < N; i++) {
            belt[i] = Integer.parseInt(br.readLine());
        }

        // -- 슬라이딩 윈도우 준비 --
        int[] cnt = new int[d + 1];         // 0번 인덱스는 사용 x

        // distinct = 서로 다른 초밥 종류의 개수
        int distinct = 0;

        // 초기 윈도우 구간을 미리 채움
        // cnt 종류를 증가시키고, 해당 종류가 0 -> 1로 바뀌면 distinct++(새로운 종류 등장)
        for (int i = 0; i < k; i++) {
            int t = belt[i];
            if (cnt[t]++ == 0) {
                distinct++;         // t가 처음 들어왔다면 서로 다른 종류가 하나 증가
            }
        }

        // 초기 상태에서의 최대값 계산
        // 쿠폰 초밥 c가 현재 윈도우에 존재하지 않는다면 1을 추가
        int ans = distinct + (cnt[c] == 0 ? 1 : 0);

        // 슬라이딩 시작
        // 윈도우 길이는 항상 k를 유지 - 맨 앞의 접시는 빠지고 새 접시만 들어옴
        for (int start = 1; start < N; start++) {
            int out = belt[start - 1];

            // 해당 종류 개수를 하나 줄이고, 1 -> 0 으로 바뀌면
            // 현재 윈도우에서 그 종류가 사라졌기에 서로 다른 종류 수를 감소시켜줌
            if (--cnt[out] == 0) {
                distinct--;
            }

            // 윈도우에 새로 들어오는 접시, 끝 인덱스는 (start + k - 1)
            // 원형 벨트이므로 N으로 모듈러 연산
            int inIdx = (start + k - 1) % N;
            int in = belt[inIdx];

            // 새 종류가 0 -> 1로 바뀌면 서로 다른 종류 수를 증가
            if (cnt[in]++ == 0) {
                distinct++;
            }

            // 현재 윈도우에서의 후보 답 계산
            // 쿠폰 초밥 c가 포함되어 있지 않은 경우 +1 추가 가능
            int cur = distinct + (cnt[c] == 0 ? 1 : 0);

            // 최댓값 갱신
            if (cur > ans) {
                ans = cur;
            }
        }

        // 결과 출력
        System.out.println(ans);
    }
}
