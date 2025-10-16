package algo251016;

import java.io.*;

// 백준 - 성택이의 은밀한 비밀번호 (브론즈 5), [14540 KB, 104 ms]
public class Baek25372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int length = str.length();
            if (length >= 6 && length <= 9) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }
        }

        System.out.println(sb);
    }
}
