package algo250426;

// 숫자 카드 찾기
/*
문제 설명
N개의 숫자가 적힌 카드 더미가 있습니다.
M개의 숫자가 주어질 때, 각 숫자가 카드 더미에 존재하는지 O(1) 시간에 확인하세요.

입력 형식
첫째 줄: 카드 개수 N (1 ≤ N ≤ 500,000)
둘째 줄: 카드에 적힌 숫자 N개 (-10⁷ ~ 10⁷)
셋째 줄: 확인할 숫자 개수 M (1 ≤ M ≤ 500,000)
넷째 줄: 확인할 숫자 M개

출력 형식
확인할 숫자에 대해, 카드 더미에 존재하면 1, 존재하지 않으면 0을 출력합니다.

입력:
5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10

출력:
1 0 0 1 1 0 0 1

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class NumberCardEx_refactor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> cardSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            cardSet.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (cardSet.contains(num)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
