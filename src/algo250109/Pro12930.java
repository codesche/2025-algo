package algo250109;

// 이상한 문자 만들기 - Lv1
public class Pro12930 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean toUpper = true;

        // 향상된 for 문을 응용
        for (char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                sb.append(c);
                toUpper = true;
            } else {
                if (toUpper) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Pro12930 T = new Pro12930();
        System.out.println(T.solution("try hello world"));
    }

}
