package algo251006;

import java.io.*;
import java.util.*;

// 백준 - Z (골드 5), [14180 KB, 104 ms]
public class Baek1074 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(zIndex(N, r, c));
    }

    private static int zIndex(int n, int r, int c) {
        int ans = 0;                        // 방문 순서 (0부터 시작)

        // 배열을 1 x 1 크기가 될 때까지 계속 4등분하며 위치 계산
        while (n > 0) {
            int half = 1 << (n - 1);        // 현재 한 변의 절반 길이 - 2^(n-1)
            int q = 0;                      // 현재 (r, c)가 속한 사분면의 번호 (0 ~ 3)
            if (r >= half) {
                q += 2;                     // 아래쪽이면 2 더함
            }

            if (c >= half) {
                q += 1;                     // 오른쪽이면 1 더함
            }

            // q: 0 = 왼쪽 위, 1 = 오른쪽 위, 2 = 왼쪽 아래, 3 = 오른쪽 아래

            ans += q * half * half;         // 해당 사분면 이전까지 건너뛴 칸 수

            // 다음 단계에서 사용할 "로컬 좌표"로 변경
            if (r >= half) {        // 아래쪽 절반이면 r을 half만큼 줄임
                r -= half;
            }

            if (c >= half) {        // 오른쪽 절반이면 c를 half만큼 줄임
                c -= half;
            }

            n--;            // 한 단계 더 작게 분할
        }

        return ans;         // 최종 방문 순서
    }

}
