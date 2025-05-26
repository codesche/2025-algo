package algo250526;

import java.io.*;
import java.util.*;

// 백준 - 0의 개수 (브론즈 1), 다른 풀이
// N부터 M까지의 수들을 종이에 적었을 때 종이에 적힌 0들을 세는 프로그램 작성
public class Baek11170_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());       // N 입력 - 0
            int M = Integer.parseInt(st.nextToken());       // M 입력 - 10

            int result = countZeros(N, M);

            System.out.println(result);
        }
    }

    public static int countZeros(int N, int M) {
        int count = 0;          // 0의 개수 저장하는 변수

        for (int num = N; num <= M; num++) {
            int currentNum = num;           // 현재 숫자 저장 변수
            if (currentNum == 0) {          // 한 자릿수 처리
                count++;
            } else {                        // 한 자릿수 이상
                while (currentNum > 0) {
                    int digit = currentNum % 10;        // 나머지 - 현재 숫자의 마지막 자릿수
                    if (digit == 0) {
                        count++;
                    }
                    currentNum /= 10;           // 다음 자릿수로 이동
                }
            }
        }

        return count;
    }

}
