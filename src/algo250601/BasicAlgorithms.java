package algo250601;

// 삽입 정렬
public class BasicAlgorithms {
    public static int[] insertionSort(int[] arr) {
        int[] result = arr.clone();
        for (int i = 1; i < result.length; i++) {
            int key = result[i];
            int j = i - 1;
            while (j >= 0 && result[j] > key) {
                result[j + 1] = result[j];
                j--;
            }
            result[j + 1] = key;
        }
        return result;
    }
}
