package algo250304;

import java.util.HashSet;

public class Programmers1845 {
    public int solution(int[] nums) {
        int max = nums.length / 2;

        // 중복 제거 위해 HashSet 선언 (자동 중복 제거)
        HashSet<Integer> set = new HashSet<>();

        for (int value : nums) {
            set.add(value);
        }

        int size = set.size();          // 1, 2, 3

        return (size > max) ? max : size;
    }

    public static void main(String[] args) {
        Programmers1845 T = new Programmers1845();
        System.out.println(T.solution(new int[]{3, 1, 2, 3}));
    }

}
