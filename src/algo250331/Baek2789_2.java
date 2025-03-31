package algo250331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 - 유학 금지 (브론즈 2)
public class Baek2789_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] spell = "CAMBRIDGE".toCharArray();

        String str = br.readLine();

        for (char c : spell) {
            if (str.indexOf(c) > -1) {
                str = str.replace(String.valueOf(c), "");
            }
        }

        System.out.println(str);
    }
}
