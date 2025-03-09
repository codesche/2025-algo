package algo250309;

// 최소직사각형 - Lv1
public class Pro86491 {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for (int[] size : sizes) {
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);
            maxW = Math.max(maxW, w);
            maxH = Math.max(maxH, h);
        }

        return maxW * maxH;
    }

    public static void main(String[] args) {
        Pro86491 T = new Pro86491();
        System.out.println(T.solution(new int[][]{
            {60, 50}, {30, 70}, {60, 30}, {80, 40}
        }));
    }
}
