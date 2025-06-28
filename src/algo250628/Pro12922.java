package algo250628;

// 프로그래머스 - 수박수박수박수박수박수? (Lv1)
public class Pro12922 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append((i % 2 == 0) ? "수" : "박");
        }

        return sb.toString();
    }
}
