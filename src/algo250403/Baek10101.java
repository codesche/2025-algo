package algo250403;

import java.io.*;

// 백준 - 삼각형 외우기(브론즈 4)
public class Baek10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a == 60 && b == 60 && c == 60) {
            sb.append("Equilateral");
        } else if (a + b + c == 180 && (a == b || b == c || a == c)) {
            sb.append("Isosceles");
        } else if (a + b + c == 180) {
            sb.append("Scalene");
        } else if (a + b + c != 180) {
            sb.append("Error");
        }

        System.out.println(sb);
    }
}
