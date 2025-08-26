package algo250826;

// 프로그래머스 - 카펫 (Lv2)
public class Pro42842 {
    public int[] solution(int brown, int yellow) {
        // 갈색과 노란색의 총 카펫의 갯수를 구한다.
        int total = brown + yellow;

        // 조건, brown 8이상 5,000 이하
        // yellow, 1이상 2,000,000 이하
        // 최소 세로는 3 (테두리 포함)
        // height <= total / height (세로가 가로보다 커지지 않도록 하기 위함 - 중복 탐색 방지)
        for (int height = 3; height <= total / height; height++) {
            // 전체 격자가 height로 나누어 떨어지면 가로 길이 구할 수 있음
            if (total % height == 0) {      // 전체 칸이 height로 나누어떨어져야 직사각형 가능
                // 가로길이
                int width = total / height;

                // 노란색 영역: (가로 - 2) * (세로 - 2)
                if ((width - 2) * (height - 2) == yellow) {
                    return new int[]{width, height};
                }
            }
        }

        return null;        // 조건 맞는 게 없을 경우 (문제 조건상 발생하지 않음)
    }
}
