package algo250903;

import java.io.*;
import java.util.*;

// 백준 - 프린터 큐 (실버 3)
/**
 * 전략:
 * - (문서 인덱스, 중요도) 를 큐에 저장
 * - 중요도 1~9의 개수를 count[] 에 저장하여 "현재 최대 중요도(curMax)"를 O(1)에 파악
 * - 매 턴, 맨 앞 문서를 꺼내 curMax와 같으면 인쇄(printed++), 아니면 뒤로 보냄
 * - 타깃 문서(idx == M) 가 인쇄되는 순간의 printed 값을 출력
 */
public class Baek1966 {

    // 문서를 나타내는 DTO
    static class Doc {
        int idx;            // 입력 시의 원래 위치
        int priority;       // 중요도 1~9
        Doc(int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());        // 테스트케이스 입력

        while (T-- > 0) {
            // N: 문서 수, M: 타깃 문서의 인덱스
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            // 우선순위(중요도) 입력
            st = new StringTokenizer(br.readLine());
            Queue<Doc> queue = new LinkedList<>();
            int[] count = new int[10];              // 중요도 1~9 저장
            int curMax = 0;                         // 현재 큐 내 가장 높은 중요도

            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(new Doc(i, priority));
                count[priority]++;

                if (priority > curMax) {
                    curMax = priority;
                }
            }

            // 지금까지 인쇄된 문서 수(= 출력 순서)
            int printed = 0;

            // 큐 시뮬레이션
            while (!queue.isEmpty()) {
                Doc front = queue.poll();

                // 현재 최댓값이면 인쇄
                if (front.priority == curMax) {
                    printed++;

                    // 타깃 문서인 경우 출력 순서 기록 후 종료
                    if (front.idx == M) {
                        sb.append(printed).append('\n');
                        break;
                    }

                    // 인쇄하였으니 해당 중요도 개수 감소
                    count[curMax]--;

                    // 현재 최댓값 소진되었으면 다음 최댓값으로 내려감
                    while (curMax > 0 && count[curMax] == 0) {
                        curMax--;
                    }
                } else {
                    // 최댓값이 아니면 뒤로 보냄
                    queue.offer(front);
                }
            }
        }
        System.out.println(sb);
    }
}
