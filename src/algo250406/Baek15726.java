package algo250406;

import java.io.*;
import java.util.*;

// 백준 - 이칙연산 (브론즈 4)
public class Baek15726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());

        int result1 = (int)((a * b) / c);
        int result2 = (int)((a / b) * c);

        int max = (int) (Math.max(result1, result2));
        System.out.println(max);
    }
}
