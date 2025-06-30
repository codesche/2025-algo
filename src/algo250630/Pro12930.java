package algo250630;

// 프로그래머스 - 이상한 문자 만들기 (Lv1)
public class Pro12930 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(" ");
                idx = 0;
            } else {
                sb.append((idx % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c));
                idx++;
            }
        }

        return sb.toString();
    }
}
