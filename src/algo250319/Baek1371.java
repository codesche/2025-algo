package algo250319;

import java.io.*;

// 백준 - 가장 많은 글자 (브론즈 2)
public class Baek1371 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        String input;

        int[] alphabet = new int[26];

        while ((input = br.readLine()) != null) {
            str += input;
        }

        // 알파벳 갯수 저장 및 가장 많이 나온 알파벳의 횟수 저장
        int length = str.length();
        int max = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != ' ') {
                alphabet[str.charAt(i) - 'a']++;

                if (alphabet[str.charAt(i) - 'a'] > max) {
                    max = alphabet[str.charAt(i) - 'a'];
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            if (max == alphabet[i]) {
                System.out.print((char) (i + 'a'));
            }
        }
    }
}
