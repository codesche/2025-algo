package algo250730;

import java.io.*;

// 백준 - 문자와 문자열 (브론즈 5)
public class Baek27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());

        sb.append(str.charAt(N - 1));
        System.out.println(sb);
    }
}
