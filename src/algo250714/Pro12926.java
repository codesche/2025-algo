package algo250714;

// 프로그래머스 - 시저 암호 (Lv1)
// 몇 칸을 밀 것인가... 'z'와 'Z'를 어떻게 처리할 것인가...
public class Pro12926 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(' ');
            } else {
                sb.append(push(c, n));
            }
        }

        return sb.toString();
    }

    public char push(char c, int n) {
        // 대소문자 구분하여 기준점 정하기
        int offset = Character.isUpperCase(c) ? 'A' : 'a';

        // 위치 구하기
        int position = c - offset;
        position = (position + n) % ('Z' - 'A' + 1);        // 29 % 26 => 3

        return (char) (offset + position);
    }
}
