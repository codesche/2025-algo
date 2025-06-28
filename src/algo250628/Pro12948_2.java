package algo250628;

// 프로그래머스 - 핸드폰 번호 가리기 (Lv1), 다른 풀이
public class Pro12948_2 {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int length = phone_number.length();

        sb.append("*".repeat(length - 4));
        sb.append(phone_number.substring((length - 4), length));

        return sb.toString();
    }
}
