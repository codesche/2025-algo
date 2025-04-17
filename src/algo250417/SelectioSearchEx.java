package algo250417;

// O(n^2): 이차 시간 알고리즘
// 선택 정렬을 이용해 정렬하는 예시
public class SelectioSearchEx {
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = tmp;
        }
    }
}
