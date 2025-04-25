package algo250425;

import java.util.Arrays;

// 프로그래머스 - 정렬 (H-index)
public class Pro42747 {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;

        Arrays.sort(citations);                 // 오름차순 정렬해야 빨리 찾을 수 있음

        for (int i = 0; i < length; i++) {
            int count = length - i;

            if (citations[i] >= count) {        // H-index 출력
                answer = count;
                break;
            }
        }

        return answer;
    }
}
