package algo250721;

// 프로그래머스 - 숫자 문자열과 영단어 (Lv1)
public class Pro81301 {

    private static final String[] words = {
        "zero", "one", "two",
        "three", "four", "five",
        "six", "seven", "eight", "nine"
    };

    public int solution(String s) {
        int answer = 0;

        // one을 1으로 대체
        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], String.valueOf(i));
        }

        answer = Integer.parseInt(s);

        return answer;
    }

}
