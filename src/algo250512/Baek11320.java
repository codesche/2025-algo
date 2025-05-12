package algo250512;

import java.io.*;
import java.util.*;

// 백준 - 삼각 무늬-1 (브론즈 3)
public class Baek11320 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());

            if (A % B == 0) {
                System.out.println((A / B) * (A / B));
            } else {
                System.out.println(((A / B) + 1) * ((A / B) + 1));
            }
        }
    }
}
