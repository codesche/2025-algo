package algo250108;

// JadenCase 문자열 만들기
public class Pro12951 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        // 배열 구성
        String[] arr = s.split(" ");

        for (String value : arr) {
            if (value.isEmpty()) {
                sb.append(" ");
            } else {
                sb.append(value.substring(0, 1).toUpperCase());                 // 첫 글자는 대문자 변환
                sb.append(value.substring(1).toLowerCase());        // 나머지는 소문자 변환
                sb.append(" ");
            }
        }

        // "3People "
        if (s.charAt(s.length() - 1) == ' ') {
            return sb.toString();
        }

        return sb.substring(0, sb.length() - 1);
    }

    public static void main(String[] args) {
        Pro12951 T = new Pro12951();
        System.out.println(T.solution("for the last week"));
    }
}
