package algo250501;

import java.io.*;

// 백준 - 팬그램 (브론즈 2)
public class Baek5704 {
    static int[] alphabet;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();

            if (s.equals("*")) {
                break;
            }

            int sum = 0;
            alphabet = new int[26];
            for (char c : s.toCharArray()) {
                if (Character.isAlphabetic(c) && alphabet[c - 'a'] == 0) {
                    alphabet[c - 'a']++;
                    sum += alphabet[c - 'a'];
                }
            }

            if (sum == 26) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
