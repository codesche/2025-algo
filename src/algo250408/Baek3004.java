package algo250408;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 백준 - 체스판 조각 (브론즈 3)
public class Baek3004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int row = N / 2 + 1;
        int col = N - row + 2;
        int result = row * col;
        System.out.println(result);
    }
}
