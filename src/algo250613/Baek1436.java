package algo250613;

import java.io.*;

// 백준 - 영화감독 숌 (실버 5), 가장 기본적인 방법
public class Baek1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());        // N 입력

        int num = 666;
        int count = 1;

        while (count != N) {
            num++;

            // int형인 num을 String으로 변환한 뒤, "666"이란 문자열이 있는지 검사
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }

        System.out.println(num);
    }
}
