package algo250115;

// 신규 아이디 추천 - Lv1
public class Pro72410 {
    public String solution(String new_id) {
        // 1단계 - new_id의 모든 대문자를 대응되는 소문자로 치환한다.
        StringBuilder answer = new StringBuilder();
        new_id = new_id.toLowerCase();

        // 2단계 - new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑즐(_), 마침표(.)를 제외한 모든 문자를 제거한다.
        for (int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);
            if (Character.isAlphabetic(ch) || Character.isDigit(ch)
                || ch == '-' || ch == '_' || ch == '.') {
                answer.append(ch);
            }
        }

        // 3단계 - new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환한다.
        while (answer.toString().contains("..")) {
            answer = new StringBuilder(answer.toString().replace("..", "."));
        }

        // 4단계 - new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거한다.
        if (!answer.isEmpty() && answer.charAt(0) == '.') {
            answer = new StringBuilder(answer.substring(1));
        }

        if (!answer.isEmpty() && answer.charAt(answer.length() - 1) == '.') {
            answer = new StringBuilder(answer.substring(0, answer.length() - 1));
        }

        // 5단계 - new_id가 빈 문자열이라면, new_id에 "a"를 대입한다.
        if (new_id.isEmpty()) {
            answer = new StringBuilder("a");
        }

        // 6단계 - new_id의 길이가 16자 이상이면, new_id의 첫 15개 문자를 제외한 나머지 문자들을 모두 제거한다.
        // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거한다.
        if (answer.length() > 15) {
            answer = new StringBuilder(answer.substring(0, 15));

            if (answer.charAt(answer.length() - 1) == '.') {
                answer = new StringBuilder(answer.substring(0, answer.length() - 1));
            }
        }

        // 7단계 - new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지
        // 반복해서 끝에 붙인다.
        while (answer.length() < 3) {
            answer.append(answer.charAt(answer.length() - 1));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Pro72410 T = new Pro72410();
        System.out.println(T.solution("...!@BaT#*..y.abcdefghijklm"));
    }
}
