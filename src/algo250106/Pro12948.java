package algo250106;

// 핸드폰 번호 가리기
public class Pro12948 {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        String[] number = phone_number.split("");
        int length = number.length;

        for (int i = 0; i < length; i++) {
            if (i < length - 4) {
                sb.append("*");
            } else {
                sb.append(number[i]);
            }
        }

        return sb.toString();
    }
}
