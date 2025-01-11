package algo250111;

// 최소직사각형 - Lv1
public class Pro86491 {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int width = Math.max(size[0], size[1]);
            int height = Math.min(size[0], size[1]);
            maxWidth = Math.max(width, maxWidth);
            maxHeight = Math.max(height, maxHeight);
        }

        return maxWidth * maxHeight;
    }

    public static void main(String[] args) {
        Pro86491 T = new Pro86491();
        System.out.println(T.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }
}
