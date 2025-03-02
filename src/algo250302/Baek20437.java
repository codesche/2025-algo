package algo250302;


// 문자열 게임 2 - 골드 5
import java.io.*;

public class Baek20437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String W = br.readLine();
            int K = Integer.parseInt(br.readLine());

            if (K == 1) {
                System.out.println("1 1");
                continue;
            }

            // 알파벳별 개수 저장
            int[] alpha = new int[26];
            int length = W.length();
            for (int j = 0; j < length; j++) {
                alpha[W.charAt(j) - 'a']++;
            }

            int min = Integer.MAX_VALUE;            // 최솟값은 가장 큰 수로
            int max = -1;                           // 최댓값은 가장 작은 수로
            for (int j = 0; j < length; j++) {
                if (alpha[W.charAt(j) - 'a'] < K) {
                    continue;
                }

                int count = 1;
                for (int l = j + 1; l < length; l++) {
                    if (W.charAt(j) == W.charAt(l)) {
                        count++;
                    }

                    if (count == K) {
                        min = Math.min(min, l - j + 1);
                        max = Math.max(max, l - j + 1);
                        break;
                    }
                }
            }

            if (min == Integer.MAX_VALUE || max == -1) {
                System.out.println("-1");
            } else {
                System.out.println(min + " " + max);
            }
        }
    }
}
