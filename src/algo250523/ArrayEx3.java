package algo250523;

import java.util.*;

// 프로그래머스 - 두 개 뽑아서 더하기(Lv1)
// 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더한다.
// 더한 수를 배열에 담는다.
// 배열에 담고 오름차순으로 정렬한다.
public class ArrayEx3 {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!list.contains(numbers[i] + numbers[j])) {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }

        // list -> array로 변환
        return list.stream().sorted().mapToInt(i -> i).toArray();
    }
}
