package algo250331;

import java.io.*;

// 백준 - 유학 금지 (브론즈 2)
public class Baek2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] spell = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};

        String str = br.readLine();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (char c : spell) {
                if (str.charAt(i) == c) {
                    count++;
                }
            }

            if (count == 0) {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
