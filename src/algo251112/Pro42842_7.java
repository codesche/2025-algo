package algo251112;

// 프로그래머스, 카펫
public class Pro42842_7 {
    public int[] solution(int brown, int yellow) {
        // 이미 리턴 배열의 길이가 주어진 상태
        int[] answer = new int[2];

        // total 카펫 확인
        int total = brown + yellow;

        // width, yellow >= 3
        for (int height = 3; height < total / height; height++) {
            if (total % height == 0) {
                // 전체 격자가 height와 나누어 떨어지면 가로는 total / width
                int width = total / height;

                // 노란색 조건 고려
                if (yellow == (width - 2) * (height - 2)) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }

        return answer;
    }
}
