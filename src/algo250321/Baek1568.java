package algo250321;

import java.io.*;

// 백준 - 새 (브론즈 2)
// 어떤 숫자 K를 노래할 때, K마리의 새가 나무에서 하늘을 향해 날아감
/*
14마리
14 - 1 = 13
13 - 2 = 11
11 - 3 = 8
8 - 4 = 4
4 - 5 = -1
 */

public class Baek1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = 1;
        int count = 0;

        while (n > 0) {
            if (n < k) {
                k = 1;
            }
            n -= k;
            count++;
            k++;
        }
        System.out.println(count);
    }
}
