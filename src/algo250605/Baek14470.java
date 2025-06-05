package algo250605;

import java.io.*;

// 백준 - 전자레인지 (브론즈 5)
// 고기가 얼어 있고 온도가 0도 미만 : 온도가 C초에 1도씩 오름
// 고기가 얼어 있고 온도가 정확히 0도일 때 : 얼어 있지 않은 상태로 만드는 데 D초가 걸림
// 고기가 얼어 있지 않을 때 : 온도가 E초에 1도씩 오름
// 핵심: 고기가 B도까지 데워지는 데 몇 초가 걸리는지 구하기
public class Baek14470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());        // 원래의 고기 온도 (-100 <= A < 100)
        int B = Integer.parseInt(br.readLine());        // 목표 온도 (A보다 큼, 1 <= B <= 100)
        int C = Integer.parseInt(br.readLine());        // 얼어 있는 고기를 1도 데우는 데 걸리는 시간
        int D = Integer.parseInt(br.readLine());        // 얼어 있는 고기를 해동하는 데 걸리는 시간
        int E = Integer.parseInt(br.readLine());        // 얼어 있지 않은 고기를 1도 데우는 데 걸리는 시간

        int second = 0;

        // A도에서 B도까지 데우려고 한다. => 얼어 있는 고기, 얼어 있지 않은 고기를 구분
        if (A < 0) {                // C초
            second += Math.abs(A) * C;
            second += D;
            second += B * E;
        } else if (A > 0) {         // E초
            second = (B - A) * E;
        }

        System.out.println(second);
    }
}
