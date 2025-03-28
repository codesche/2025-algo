package algo250328;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 백준 - 시그마 (브론즈 2)
public class Baek2355_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        // 항상 a가 b보다 큰 것은 아니기 때문에 큰 수, 작은 수 구분하기 위한 로직
        long n = Math.min(a, b);
        long m = Math.max(a, b);

        // 공식 활용
        long answer = (n + m) * (m - n + 1) / 2;
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
