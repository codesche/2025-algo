package algo251112;

public class Pro42842_4 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;

        // 조건 상 width와 height 는 무조건 3 이상이어야 함
        for (int height = 3; height < total / height; height++) {
            if (total % height == 0) {
                int width = total / height;
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
