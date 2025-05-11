package algo250511;

import java.io.*;
import java.util.*;

// 백준 - 명장 남정훈 (브론즈 3)
// 1. 왼발과 오른발 수의 차이를 양발잡이 선수로 최대한 메꿔야 한다.
// 2. 남은 양발잡이 선수가 짝수라면 모두 팀에 넣을 수 있고, 홀수라면 한 명은 방출해야 함.
// 3. 최종적으로 (L + R + A)에서 맞지 않는 부분을 빼는 방식으로 계산
public class Baek15734 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 왼발잡이 선수 L, 오른발잡이 선수 R, 양발잡이 선수 A
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        // 먼저 왼발과 오른발 선수 수의 차이를 구함
        int diff = Math.abs(L - R);

        if (A >= diff) {
            // 양발잡이로 차이를 다 맞출 수 있다면,
            // 왼발과 오른발 수를 맞추고 남은 양발잡이 수를 짝수로 맞춰서 사용
            int remaining = A - diff;

            // 남은 양발잡이 선수도 짝수만큼 추가
            int maxTeamSize = (L + R + diff) + (remaining / 2) * 2;

            System.out.println(maxTeamSize);
        } else {
            // 양발잡이로도 차이를 메꾸지 못하면 그냥 A만큼 한쪽을 보충하고 끝낸다.
            int maxTeamSize = (L + R + A) - (diff - A);
            System.out.println(maxTeamSize);
        }

    }
}
