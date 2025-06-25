package algo250626;

// 프로그래머스 - 서울에서 김서방 찾기 (Lv1)
public class Pro12919 {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        for (String str : seoul) {
            if (str.contains("Kim")) {
                sb.append("김서방은").append(" ").append(idx).append("에 있다");
            }
            idx++;
        }

        return sb.toString();
    }
}
