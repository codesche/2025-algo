package algo250417;

// O(nlogn) - 로그 선형 알고리즘
// 병합 정렬을 이용해 정렬하는 예시
// 재귀 활용
public class MergeSortEx {
    public static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
//            merge(nums, left, mid, right);
        }
    }
}
