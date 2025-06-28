package algo250628;

// 프로그머스 - 가운데 글자 가져오기 (Lv1),  다른 풀이
public class Pro12903_2 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int length = s.length();

        if (length % 2 == 0) {      // 짝수
            sb.append(s.substring((length / 2) - 1, (length / 2) + 1));
        } else {        // 홀수
            sb.append(s.charAt(length / 2));
        }

        return sb.toString();
    }
}
