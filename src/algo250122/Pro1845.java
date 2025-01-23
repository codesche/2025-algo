package algo250122;

import java.util.*;

// 폰켓몬 - Lv1
public class Pro1845 {
    public int solution(int[] nums) {
        int length = nums.length / 2;

        // 중복 제거 위해 HashSet 선언
        HashSet<Integer> set = new HashSet<>();

        // 배열 요소 HashSet에 추가
        for (int num : nums) {
            set.add(num);
        }

        int size = set.size();

        return (size >= length) ? length : size;
    }

    public static void main(String[] args) {
        Pro1845 T = new Pro1845();
        System.out.println(T.solution(new int[]{3, 1, 2, 3}));
    }
}
