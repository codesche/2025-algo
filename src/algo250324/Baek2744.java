package algo250324;

import java.io.*;

// 백준 - 대소문자 바꾸기 (브론즈 5)
public class Baek2744 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(Character.toUpperCase(ch));
            }
        }

        System.out.println(sb);
    }
}
