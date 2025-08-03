package algo250803;

import java.io.*;

// 백준 - A + B - C (브론즈 4)
public class Baek31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // a, b, c 입력
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        // 숫자로 간주
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        int numC = Integer.parseInt(c);

        // 숫자로 간주
        System.out.println(numA + numB - numC);

        // 문자열로 간주
        int abStr = Integer.parseInt(a + b);
        System.out.println(abStr - numC);
    }
}
