package algo251021;

import java.io.*;

// 백준 - 팰린드롬인지 확인하기 (브론즈 3)
public class Baek10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer = (input.contentEquals(new StringBuilder(input).reverse())) ? 1 : 0;
        System.out.println(answer);
    }
}
