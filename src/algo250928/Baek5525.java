package algo250928;

import java.io.*;

// 백준 - IOIOI (실버 1), [20256 KB, 240 ms]

/**
 * 연속된 IOIOI... 패턴을 발견하면:
 * 1. "OI" 개수를 센다
 * 2. N개가 되면 카운트 증가
 * 3. 슬라이딩 윈도우로 계속 체크
 */
public class Baek5525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int result = 0;
        int i = 0;

        while (i < m - 2) {
            // "IOI" 패턴이 시작되는 위치 찾기
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I') {
                int ioiCount = 0;

                // 연속된 "OI" 패턴 개수 세기
                while (i + 2 < m && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I') {
                    ioiCount++;
                    i += 2;             // "OI" 단위로 이동

                    // Pn 패턴을 찾았을 때
                    if (ioiCount == n) {
                        result++;

                        // 슬라이딩 윈도우 방식으로 체크
                        ioiCount--;                         // 맨 앞의 IOI를 빼고 뒤에 OI가 추가되는 효과
                    }
                }
                i++;        // 다음 위치로 이동
            } else {
                i++;
            }
        }

        System.out.println(result);
    }

}
