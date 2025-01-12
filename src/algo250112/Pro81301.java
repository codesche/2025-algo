package algo250112;

// 숫자 문자열과 영단어 - Lv1
public class Pro81301 {
    public int solution(String s) {
        // 영단어 배열 순회하며 입력 문자열에 등장하는 모든 영단어 치환한 문자열 생성하기
        int length = words.length;
        for (int i = 0; i < length; i++) {
            s = s.replace(words[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }

    // 영단어 문자열 배열 구성
    private static String[] words = {
        "zero", "one", "two", "three",
        "four", "five", "six", "seven",
        "eight", "nine",
    };

    public static void main(String[] args) {
        Pro81301 T = new Pro81301();
        System.out.println(T.solution("one4seveneight"));
    }
}
