package algo250518;

import java.io.*;

// 백준 - 16진수 (브론즈 2)
public class Baek1550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(Integer.parseInt(str, 16));
    }
}
