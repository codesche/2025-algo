package algo250417;

// O(log n): 로그 시간 알고리즘, 이진 탐색 알고리즘
// 입력 크기가 증가함에 따라 실행 시간이 로그함수 형태로 증가
// 정렬된 배열에서 특정 값을 찾을 때 유용하게 사용
public class BinarySearchEx {
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
