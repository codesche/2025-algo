package algo250426;

import java.io.*;
import java.util.*;

// 백준 - 치킨댄스를 추는 곰곰이를 본 임스 (브론즈 4)
// 치킨 1마리를 먹을 때 반드시 집에 있는 콜라 2개나 맥주 1개와 같이 먹어야 함
// 치킨집에 있는 치킨의 개수보다 치킨을 많이 시킬 수는 없음
// 5, 4, 2 => 치킨 한 마리에 맥주 한 개 => (1, 1), (1, 1)
// 3, 4 => 치킨 한 마리에 콜라 2개 => (1, 2), (1, 2)
// 시간 초과 코드

public class Baek25191 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int n = Integer.parseInt(br.readLine());        // 치킨의 개수

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());       // 콜라의 개수
        int b = Integer.parseInt(st.nextToken());       // 맥주의 개수

        // 콜라
        while (a != 0) {
            a -= 2;
            answer++;
            n--;
        }

        // 맥주
        while (b != 0) {
            if (n == 0) {
                break;
            }

            b -= 1;
            answer++;
            n--;
        }

        System.out.println(answer);
    }
}
