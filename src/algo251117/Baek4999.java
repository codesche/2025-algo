package algo251117;

import java.io.*;

// 백준 - 아! (브론즈 5)
public class Baek4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String jaeHwan = br.readLine();
        String doctor = br.readLine();

        StringBuilder sb = new StringBuilder();

        if (jaeHwan.length() < doctor.length()) {
            sb.append("no");
        } else {
            sb.append("go");
        }

        System.out.println(sb);
    }
}
