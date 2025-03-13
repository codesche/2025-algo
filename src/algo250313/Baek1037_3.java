package algo250313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 - 약수, 배열 사용 X
// 단순히 최소공배수로 구하면 안 됨
// 입력으로 들어오는 최솟값과 최댓값을 서로 곱하면 된다.
public class Baek1037_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while (T-- > 0) {
            int N = Integer.parseInt(st.nextToken());
            max = Math.max(N, max);
            min = Math.min(N, min);
        }

        System.out.println(max * min);
    }
}
