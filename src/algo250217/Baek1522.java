package algo250217;

import java.io.*;

// 문자열 교환 - 실버 1
public class Baek1522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int length = str.length();
        int min = Integer.MAX_VALUE;
        int aLength = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 'a') {
                aLength++;
            }
        }

        for (int i = 0; i < length; i++) {
            int count = 0;                      // b의 갯수
            for (int j = i; j < aLength + i; j++) {
                if (str.charAt(j % length) == 'b') {
                    count++;
                }
            }
            min = Math.min(min, count);
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();
    }
}
