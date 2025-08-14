package algo250814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 - solved.ac (실버 4)
// 위에서 15%, 아래에서 15% => 8개

/**
 * br.lines().limit(n)으로 첫 줄(n) 이후의 정확히 n개만 스트림으로 처리.
 * sorted() → skip(k) → limit(n - 2L*k)로 양쪽 15% 절사를 함수형 체인으로 표현.
 * 평균은 average()로 구하고, 최종 출력은 Math.round(반올림)로 문제 요구와 일치.
 * limit에 long이 필요하므로 2L * k 사용.
 */

public class Baek18110_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.println("0");
        }

        // 절사할 개수 (반올림)
        int k = (int) Math.round(n * 0.15);

        // 남은 라인 n개를 읽어 정수로 변환 -> 정렬 -> 앞/뒤 k개 절사 -> 평균 -> 반올림
        int answer =
            (int) Math.round(
                br.lines()
                  .limit(n)
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .skip(k)        // 앞에서 k개 버림
                    .limit(n - 2L * k)  // 뒤에서 k개도 버리도록 길이 제한
                    .average()
                    .orElse(0)
            );

        System.out.println(answer);
    }
}
