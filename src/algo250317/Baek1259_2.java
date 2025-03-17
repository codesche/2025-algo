package algo250317;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 - 팰린드롬수 (브론즈 1)
public class Baek1259_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";

        while (true) {
            str = br.readLine();

            if (str.equals("0")) {
                break;
            }

            int length = str.length();
            int idx = length - 1;
            int count = 0;
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) == str.charAt(idx)) {
                    count++;
                }
                idx--;
            }

            if (count == length / 2) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }

        System.out.print(sb);
    }
}
