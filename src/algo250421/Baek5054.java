package algo250421;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 - 주차의 신 (브론즈 2)
// 위치들 중 가장 가까운 곳부터 차례로 방문하고, 다시 원래 위치로 돌아가야 함
// 최단 거리로 모든 상점을 방문하고 차로 돌아와야 한다.
// 가장 짧은 거리는 맨 좌측에서 맨 우측까지 갔다가 다시 돌아오는 거리 => 2 * (최댓값 위치 - 최솟값 위치)
public class Baek5054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());                        // 테스트 케이스 수

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());                    // 차량 케이스 수
            int[] position = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                position[j] = Integer.parseInt(st.nextToken());
            }

            int min = position[0];
            int max = position[0];

            for (int k = 1; k < n; k++) {
                if (position[k] < min) {
                    min = position[k];
                }

                if (position[k] > max) {
                    max = position[k];
                }
            }

            int distance = (max - min) * 2;
            System.out.println(distance);
        }

        br.close();
    }
}
