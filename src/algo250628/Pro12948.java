package algo250628;

// 프로그래머스 - 핸드폰 번호 가리기 (Lv1)
public class Pro12948 {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int length = phone_number.length();

        for (int i = 0; i < length - 4; i++) {
            sb.append('*');
        }

        sb.append(phone_number.substring((length - 4), length));

        return sb.toString();
    }
}
