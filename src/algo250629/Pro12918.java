package algo250629;

// 프로그래머스 - 문자열 다루기 기본 (Lv1)
public class Pro12918 {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();

        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }

        answer = count == length && (length == 4 || length == 6);

        return answer;
    }
}
