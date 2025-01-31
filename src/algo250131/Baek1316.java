package algo250131;

// 그룹 단어 체커 - 실버 5
// ccazzzzbb => c, a, z, b가 모두 연속해서 나타나므로 그룹 단어
// aabbbccb => b가 떨어져서 나타나므로 그룹 단어가 아님
// happy new year => 연속된 단어의 길이가 0이 아닌 것들에 한해서 카운팅 해주면 됨?!
// 길이가 1, 2인 단어들은 무조건 카운팅

// 문자열의 문자가 연속되지 않으면서 이미 앞서 해당 문자가 입력된 적이 있다면 그룹 단어가 아님

// 해결방법
// 의사코드(sudocode) 를 잘 활용하는 게 중요
// 그룹 단어 체크 함수 선언 => check()
// 단어가 입력되면 해당 문자열이 그룹 단어인지 아닌지만 따지면 되기 때문에 return 타입은 boolean

import java.io.*;
import java.util.*;

public class Baek1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        // 단어의 개수 입력
        int N = Integer.parseInt(br.readLine());

        // 단어의 개수 출력
        int answer = 0;

        // 문자열 입력
        for (int i = 0; i < N; i++) {
            if (check()) {
                answer++;
            }
        }

        System.out.print(answer);
    }

    // 체크 함수 만들기
    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;                           // 이전 문자 확인 위해 prev 변수 활용
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);            // i 번째 문자 저장 (현재 문자)

            // 앞선 문자와 i 번째 문자가 같지 않을 경우
            if (prev != now) {
                // 해당 문자가 처음 나오는 경우
                if (!check[now - 'a']) {
                    check[now - 'a'] = true;
                    prev = now;                     // 다음 문자 확인을 위해 prev = now
                } else {
                    return false;
                }
            } else {            // 앞선 문자와 i 번째 문자가 같은 경우 (연속된 문자)
                continue;
            }
        }
        return true;
    }

}
