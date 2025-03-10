package algo250310;

// 조이스틱 - Lv2
public class Pro42860 {
    public int solution(String name) {
        int answer = 0;                     // 조이스틱 조작 횟수
        int length = name.length();
        int move = length - 1;              // 기본 최소 좌우 이동 횟수 (좌, 우 커서)

        // 해당 커서 알파벳 변경 최솟값 (위, 아래 커서)
        for (int i = 0; i < length; i++) {
            char ch = name.charAt(i);
            answer += Math.min(ch - 'A', 'Z' - ch + 1);

            // 연속된 알파벳 'A'가 끝나는 지점 찾기
            int idx = i + 1;
            while (idx < length && name.charAt(idx) == 'A') {
                idx++;
            }

            // 좌우이동 최소 횟수 구하기
            move = Math.min(move, i * 2 + length - idx);
            move = Math.min(move, (length - idx) * 2 + i);
        }

        return answer + move;
    }

    public static void main(String[] args) {
        Pro42860 T = new Pro42860();
        System.out.println(T.solution("JAN"));
    }
}
