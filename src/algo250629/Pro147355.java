package algo250629;

// 프로그래머스 - 크기가 작은 부분문자열 (Lv1)
public class Pro147355 {
    public int solution(String t, String p) {
        int answer = 0;
        int length = t.length() - p.length() + 1;

        for (int i = 0; i < length; i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }
}
