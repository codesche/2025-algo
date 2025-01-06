package algo250106;

// 가운데 글자 가져오기
// 길이의 짝수, 홀수 구분 필요
public class Pro12903 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        if (s.length() % 2 == 0) {      // 짝수
            sb.append(s.charAt(s.length() / 2 - 1));
            sb.append(s.charAt(s.length() / 2));
        } else {                        // 홀수
            sb.append(s.charAt(s.length() / 2));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Pro12903 T = new Pro12903();
        System.out.println(T.solution("qwertys"));
    }
}
