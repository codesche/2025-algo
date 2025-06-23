package algo250623;

// 프로그래머스, 음양 더하기 (Lv1)
public class Pro76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        int idx = 0;
        for (int number : absolutes) {
            if (!signs[idx++]) {
                answer -= number;
            } else {
                answer += number;
            }
        }

        return answer;
    }
}
