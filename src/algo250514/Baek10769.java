package algo250514;

import java.io.*;

// 백준 - 행복한지 슬픈지 (브론즈 1)
public class Baek10769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String message = br.readLine().trim();

        // :-):-(:-)? - 문자와 띄어쓰기 제외한 문자들만 고려
        for (char c : message.toCharArray()) {
            if (!Character.isAlphabetic(c) && c != ' ') {
                sb.append(c);
            }
        }

        if (sb.toString().contains(":-)") || sb.toString().contains(":-(")) {
            int open = 0;
            int close = 0;

            for (int i = 0; i < sb.length(); i++) {
                if (sb.toString().charAt(i) == '(') {
                    open++;
                } else if (sb.toString().charAt(i) == ')') {
                    close++;
                }
            }

            if (open < close) {
                System.out.println("happy");
            } else if (open == close) {
                System.out.println("unsure");
            } else {
                System.out.println("sad");
            }
        } else {
            System.out.println("none");
        }
    }
}
