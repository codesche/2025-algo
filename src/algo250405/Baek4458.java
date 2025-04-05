package algo250405;

import java.io.*;

// 백준 - 첫 글자를 대문자로 (브론즈 3)
public class Baek4458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            int idx = 0;
            for (char c : str.toCharArray()) {
                if (idx == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(c);
                }
                idx++;
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}
