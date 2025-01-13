package algo250113;

import java.util.*;

// 구명보트 - Lv2
public class Pro42885 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int length = people.length;
        int idx = 0;

        // 오름차순 정렬 - 마지막 원소부터 idx보다 크거나 작을 때까지 반복문 돌리기
        // [50, 50, 70, 80]
        Arrays.sort(people);

        for (int i = length - 1; i >= idx; i--) {
            if (people[i] + people[idx] <= limit) {         // 두 개를 더해서 limit보다 작거나 같은 경우
                answer++;
                idx++;
            } else {
                answer++;                                   // 두 개를 더해서 limit 보다 큰 경우
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Pro42885 T = new Pro42885();
        System.out.println(T.solution(new int[]{70, 50, 80, 50}, 100));
    }
}
