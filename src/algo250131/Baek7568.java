package algo250131;

// 덩치 - 실버 5
// (몸무게, 키) => (x, y)
// A와 B의 덩치가 (x, y), (p, q) => x > p && y > q 인 경우 A의 덩치가 B의 덩치보다 크다.

// 입력 받은 사람의 수 만큼의 몸무게와 키를 받는 1차원 배열 2개 생성하기
// 랭킹의 기본 값을 1로 설정 후 각각의 사람들의 몸무게와 키값 비교
// 몸무게와 키 두 가지 모두 낮을 경우에만 랭킹을 증가시킴 (몸무게만 높거나 키만 높을 경우 순위 유지)

import java.util.StringTokenizer;
import java.io.*;

public class Baek7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] arrWeight = new int[N];
        int[] arrHeight = new int[N];

        // 몸무게, 키 입력
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arrWeight[i] = Integer.parseInt(st.nextToken());
            arrHeight[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int tempWeight = arrWeight[i];
            int tempHeight = arrHeight[i];
            int rate = 1;
            for (int j = 0; j < N; j++) {
                // 본인은 비교하지 않음
                if (j == i) {
                    continue;
                }

                if (tempWeight < arrWeight[j] && tempHeight < arrHeight[j]) {
                    rate++;
                }
            }
            bw.write(rate + " ");
        }
        bw.flush();
        bw.close();
    }
}
