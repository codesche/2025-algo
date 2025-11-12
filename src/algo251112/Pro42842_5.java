package algo251112;

public class Pro42842_5 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;

        // width, height >= 3
        for (int height = 3; height < total / height; height++) {
            if (total % height == 0) {
                int width = total / height;
                // 노란색을 고려
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
