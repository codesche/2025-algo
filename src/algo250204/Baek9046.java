package algo250204;

import java.io.*;

// 복호화 - 브론즈 2
public class Baek9046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine().replace(" ", "");
            int max = 0;            // 최다 알파벳 인덱스 번호 저장
            int count = 0;          // 최다 알파벳이 2개 이상

            int[] alphabet = new int[26];
            int alphaLength = alphabet.length;
            int length = str.length();

            for (int j = 0; j < length; j++) {
                alphabet[str.charAt(j) - 'a']++;
            }

            for (int k = 1; k < alphaLength; k++) {
                if (alphabet[max] < alphabet[k]) {
                    max = k;
                }
            }

            for (int value : alphabet) {
                if (alphabet[max] == value) {
                    count++;
                }
            }

            char ch = (char) (max + 'a');
            System.out.println(count > 1 ? "?" : ch);
        }
    }
}
