package algo250506;

import java.io.*;
import java.util.*;

// 백준 - 남욱이의 닭장 (브론즈 3)
// 출력 - 다리가 잘린 닭의 수 U, 멀정한 닭의 수 T
// 닭 한 마리당 다리 수는 2개
// 잘린 다리 수만큼이 멀쩡하지 않은 닭의 수
public class Baek11006 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());       // 모든 닭의 다리수의 합 (7) -> 10개
            int m = Integer.parseInt(st.nextToken());       // 닭의 수 (5)

            int U = m * 2 - n;
            int T = m - U;

            sb.append(U).append(" ").append(T).append("\n");
        }

        System.out.print(sb);
    }

}
