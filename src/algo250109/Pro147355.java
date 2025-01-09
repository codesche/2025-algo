package algo250109;

// 크기가 작은 부분문자열 - Lv1
public class Pro147355 {
    public int solution(String t, String p) {
        int length = t.length() - p.length() - 1;
        long pNum = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i < length; i++) {
            String str = t.substring(i, i + p.length());
            long tValue = Long.parseLong(str);

            if (pNum <= tValue) {
                answer++;
            }
        }

        return answer;
    }
}
