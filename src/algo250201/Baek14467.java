package algo250201;

import java.util.*;
import java.io.*;

// 소가 길을 건너간 이유 - 브론즈 1

// 규칙
// 1, 0, 1 => 2번
// 1, 0, 1, 0 => 3번
// 1, 0 => 1번
// n => n - 1

// 원래 위치가 정해져 있지 않기에 첫번째로 받는 위치는 이동한 횟수에 저장하지 않기 위해 배열을 -1로 채운다.
// 만약 위치가 -1이라면 첫번째 이동이므로 카운트하지 않고 그게 아니라면 현재 위치와 입력받은 위치를 비교해 다른 경우
// 현재 위치를 넣어주고 카운트를 증가시켜준다.

public class Baek14467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력
        int N = Integer.parseInt(br.readLine());

        // 소 위치 배열 선언
        int[] position = new int[11];
        Arrays.fill(position, -1);                      // 원래 위치를 -1로 정해줌

        // count 변수 선언
        int count = 0;

        // 순회
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());          // 소 번호
            int pos = Integer.parseInt(st.nextToken());          // 소 위치

            if (position[num] == -1) {                          // 처음 위치 확인 후 위치 변경
                position[num] = pos;
            } else if (position[num] != pos) {                  // 위치 변화가 발생한 경우
                position[num] = pos;
                count++;
            }
        }

        System.out.println(count);
    }
}
