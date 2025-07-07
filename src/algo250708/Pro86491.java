package algo250708;

// 프로그래머스 - 최소직사각형 (Lv1)
public class Pro86491 {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for (int i = 0; i < sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]);
            int height = Math.min(sizes[i][0], sizes[i][1]);

            maxW = Math.max(maxW, width);
            maxH = Math.max(maxH, height);
        }

        return maxW * maxH;
    }
}
