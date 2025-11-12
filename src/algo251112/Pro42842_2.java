package algo251112;

// total = brown + yellow;
// yellow = (width - 2) * (height - 2);
// width * height = total;
public class Pro42842_2 {
    public int[] solution(int brown, int yellow) {
        // 이미 리턴 배열의 길이가 주어짐
        int[] answer = new int[2];
        int total = brown + yellow;

        // width와 height는 무조건 3이상이어야 함
        // 3부터 시작
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
