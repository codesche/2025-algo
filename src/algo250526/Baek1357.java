package algo250526;

import java.io.*;
import java.util.*;

// 백준 - 뒤집힌 덧셈 (브론즈 2)
// X의 모든 자리수가 역순이 된 수 => Rev(X)
// X = 123, Rev(X) = 321
// X = 100, Rev(X) = 001(x), 1(o) => 예외 처리 (조건)
public class Baek1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // X와 Y를 뒤집어야 한다 => 역순으로 출력 => 역순으로 출력한 숫자 두 개를 더해야 함
        String X = st.nextToken();
        String Y = st.nextToken();

        StringBuilder sb = new StringBuilder(X);
        String reversedX = sb.reverse().toString();

        sb = new StringBuilder(Y);
        String reversedY = sb.reverse().toString();

        int reversedIntX = Integer.parseInt(reversedX);
        int reversedIntY = Integer.parseInt(reversedY);

        int resultValue = reversedIntX + reversedIntY;

        String reversedResult = String.valueOf(resultValue);
        sb = new StringBuilder(reversedResult);

        String answer = sb.reverse().toString();

        // "01, 001 반환 고려하여 정수형으로 변환
        System.out.println(Integer.parseInt(answer));
    }
}
