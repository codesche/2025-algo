package algo250730;

import java.io.*;

// 백준 - 나누기 (브론즈 2)
public class Baek1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력 받기
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        int NLength = String.valueOf(N).length();

        // 정수 N의 가장 뒤 두 자리 바꿔서 일일이 비교
        for (int i = 0; i <= 99; i++) {
            int length = String.valueOf(i).length();
            int temp = 0;
            if (length == 1) {
                temp = Integer.parseInt(String.valueOf(N).substring(0, NLength - 2) + 0 + String.valueOf(i));
            } else {
                temp = Integer.parseInt(String.valueOf(N).substring(0, NLength - 2) + String.valueOf(i));
            }

            if (temp % F == 0) {
                sb.append(String.valueOf(temp), NLength - 2, NLength);
                break;
            }
        }

        System.out.println(sb);
    }
}
