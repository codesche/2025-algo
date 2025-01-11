package algo250111;

// 시저 암호 - Lv1
public class Pro12926 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(push(c, n));
        }
        return sb.toString();
    }

    private char push(char c, int n) {
        if (!Character.isAlphabetic(c)) {                       // 공백 처리
            return c;
        }

        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = c - offset;                              // 자르기
        position = (position + n) % ('Z' - 'A' + 1);
        return (char) (offset + position);                      // ex) 67 -> 'C'
    }

    public static void main(String[] args) {
        Pro12926 T = new Pro12926();
        System.out.println(T.solution("AB", 1));
    }

}
