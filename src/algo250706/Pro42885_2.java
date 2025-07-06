package algo250706;

import java.util.Arrays;

// 프로그래머스 - 구명보트 (Lv2), 다른 풀이 - 투 포인터
public class Pro42885_2 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);            // 정렬

        int left = 0;
        int right = people.length - 1;
        int answer = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;     // 가장 가벼운 사람 태우기
            }

            // 무조건 가장 무거운 사람 태우기
            right--;
            answer++;           // 보트 하나 사용
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro42885_2 p = new Pro42885_2();
        System.out.println(p.solution(new int[]{70, 80, 50}, 100));
    }
}
