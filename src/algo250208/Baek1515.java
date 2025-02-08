package algo250208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// 수 이어 쓰기 - 실버 3
/*
입력으로 주어지는 수: 최대 3000자리
0~9까지는 10개
=> 3000 * 10 = 30000 이내에서 모두 찾아질 것임

 */
public class Baek1515 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String number = br.readLine();

        int pointer = 0;
        String base = null;

        loop:
        for (int i = 1; i < 30000; i++) {
            base = String.valueOf(i);       // base = 1 선언 (1부터 N까지 모든 수를 차례대로 입력)
            int length = base.length();
            for (int j = 0; j < length; j++) {          // pointer와 비교
                if (number.charAt(pointer) == base.charAt(j)) {     // base와 pointer의 숫자가 동일하면 pointer 증가
                    pointer++;
                }

                // pointer와 입력한 숫자의 길이가 같으면 이중 for 문 루프 빠져나가기
                if (pointer == number.length()) {
                    break loop;
                }
            }
        }

        bw.write(base);
        bw.flush();
        bw.close();
        br.close();
    }
}
