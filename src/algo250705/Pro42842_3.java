package algo250705;

// 프로그래머스 - 카펫 (Lv2), 다른 풀이
// 핵심 포인트 - 노란색의 경우 갯수와 넓이가 같다

/**
 * 전체 면적 = brown + yellow = width × height
 * 갈색 수식: brown = width * 2 + height * 2 - 4 (테두리니까)
 * 노란색 수식: yellow = (width - 2) * (height - 2)
 */

public class Pro42842_3 {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        // 수학적 유도 기반 직접 계산
        for (int height = 3; height <= total / height; height++) {
            if (total % height == 0) {
                int width = total / height;

                if ((width - 2) * (height - 2) == yellow) {
                    return new int[]{width, height};
                }
            }
        }

        return null;
    }
}
