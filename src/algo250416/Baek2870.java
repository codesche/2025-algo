package algo250416;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.math.BigInteger;

// 백준 - 수학숙제 (실버 4)
// 43silos0
// zita002
// le2sim
// 231233
public class Baek2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<BigInteger> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split("\\D");  // 숫자만 남기고 다 자름

            for (String value : arr) {
                if (!value.isEmpty()) {
                    list.add(new BigInteger(value));
                }
            }
            list.sort(null);        // 오름차순으로 정렬
        }

        for (BigInteger integer : list) {
            System.out.println(integer);
        }
    }
}
