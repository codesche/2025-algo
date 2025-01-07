package algo250107;

// 행렬
public class Pro12950 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int length = arr1.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }

        return arr1;
    }
}
