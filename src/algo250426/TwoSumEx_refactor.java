package algo250426;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumEx_refactor {
    public int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                answer[0] = map.get(complement);
                answer[1] = i;
                return answer;
            }

            map.put(nums[i], i);            // 숫자, 인덱스
        }

        return answer;
    }

    public static void main(String[] args) {
        TwoSumEx_refactor T = new TwoSumEx_refactor();
        System.out.println(Arrays.toString(T.solution(new int[]{2, 7, 11 ,5}, 9)));
    }
}
