package algo250514;

import java.io.*;

// 백준 - 나는 친구가 적다(Small) - 브론즈 2
public class Baek16171 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String keyword = br.readLine();

        // 숫자 제외, 문자만 인식
        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }

       if (sb.toString().contains(keyword)) {
           System.out.println(1);
       } else {
           System.out.println(0);
       }
    }
}
