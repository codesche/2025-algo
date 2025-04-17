package algo250417;

// O(n) - 입력한 배열을 역순으로 만드는 함수를 구현
// 선형 시간 알고리즘
public class LinearSearchEx {
    public static int[] reverse(int[] nums) {
        int[] reversed = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            reversed[nums.length - i - 1] = nums[i];
        }
        return reversed;
    }
}
