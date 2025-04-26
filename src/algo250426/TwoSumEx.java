package algo250426;

import java.util.Arrays;

public class TwoSumEx {
    public int[] solution(int[] nums, int target) {
        int[] answer = new int[2];
        int start = 0;
        int end = 1;

        while (start != nums.length - 1) {
            if (nums[start] + nums[end] != target) {
                end++;
                if (end == nums.length) {
                    start++;
                    end = start + 1;
                }
            } else {
                answer[0] = start;
                answer[1] = end;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        TwoSumEx T = new TwoSumEx();
        System.out.println(Arrays.toString(T.solution(new int[]{2, 7, 11 ,5}, 9)));
    }
}
