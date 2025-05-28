package algo250528.info;

// 배열 최댓값 찾기
public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {23, 56, 12, 78, 90, 34};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("최댓값 : " + max);
    }
}
