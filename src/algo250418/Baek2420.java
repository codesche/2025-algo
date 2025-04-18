package algo250418;

import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 백준 - 사파리월드 (브론즈 5)
public class Baek2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        System.out.print(Math.abs(N - M));
    }
}
