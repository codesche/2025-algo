package algo250706;

import java.util.Arrays;

// 프로그래머스 - 구명보트 (Lv2)
public class Pro42885 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int length = people.length;
        int idx = 0;

        // 몸무게가 가장 적은 사람이 앞에 배치됨 [50, 50, 70, 80]
        // [50, 70, 80]
        Arrays.sort(people);

        for (int i = length - 1; i >= idx; i--) {
            if (people[i] + people[idx] <= limit) {         // 무게 제한보다 같거나 작을 때
                answer++;
                idx++;
            } else {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro42885 p = new Pro42885();
        System.out.println(p.solution(new int[]{70, 80, 50}, 100));
    }
}
