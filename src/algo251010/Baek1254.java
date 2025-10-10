package algo251010;

import java.io.*;

// 백준 - 팰린드롬 만들기 (실버 2)
public class Baek1254 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            String str = s.substring(i);
            String rev = new StringBuilder(str).reverse().toString();
            if (str.equals(rev)) {
                System.out.println(n + i);
                return;
            }
        }
    }

}
