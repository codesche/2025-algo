package algo250401;

import java.io.*;
import java.util.StringTokenizer;

// 백준 - 몇개고? (브론즈 5)
public class Baek27294 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int t = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int answer = 0;

        answer = (t >= 12 && t < 17 && s == 0) ? 320 : 280;

        System.out.println(answer);
    }
}
