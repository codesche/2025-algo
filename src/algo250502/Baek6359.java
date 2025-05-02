package algo250502;

import java.io.*;
import java.util.*;

// 만취한 상범 (브론즈 2)
// k번째 라운드에서는 번호가 k의 배수인 방이 열려 있으면 잠그고, 잠겨 있다면 연다.
/*
- 5개 방
1라운드: 모든 방 오픈 true
2라운드: 2의 배수 방 닫음 false
3라운드: 3의 배수 방 중에 열려있으면 잠그고(false), 잠겨있으면 연다(true).
...
[0, 1, 2, 3, 4]
 */
public class Baek6359 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());            // 테스트 케이스

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());        // 방의 개수 n 입력
            boolean[] rooms = new boolean[n];               // 방 배열 생성

            int round = 1;
            while (true) {
                for (int j = 0; j < n; j++) {
                    if (!rooms[j] && ((j + 1) % round == 0)) {
                        rooms[j] = true;
                    } else if (rooms[j] && ((j + 1) % round == 0)) {
                        rooms[j] = false;
                    }
                }

                if (round == n) {
                    break;
                }

                round++;
            }

            int answer = 0;
            for (boolean room : rooms) {
                if (room) {
                    answer++;
                }
            }

            System.out.println(answer);
        }
    }
}
