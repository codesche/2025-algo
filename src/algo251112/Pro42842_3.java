package algo251112;

public class Pro42842_3 {
    public int[] solution(int brown, int yellow) {
        // 이미 리턴 배열의 길이가 주어짐
        int[] answer = new int[2];
        int total = brown + yellow;

        // width와 height는 무조건 3이상이어야 함
        for (int height = 3; height <= total / height; height++) {
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
