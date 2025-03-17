package algo250317;

import java.io.*;

// 백준 - 팰린드롬수 (브론즈 1)
public class Baek1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
