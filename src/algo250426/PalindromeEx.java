package algo250426;

// 팰린드롬 문제
public class PalindromeEx {
    public boolean solution(String s) {
        boolean answer = false;

        int length = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                sb.append(s.toLowerCase().charAt(i));
            }
        }

        StringBuilder sb2 = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            if (Character.isAlphabetic(s.charAt(i))) {
                sb2.append(s.toLowerCase().charAt(i));
            }
        }

        if (sb.compareTo(sb2) == 0) {
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {
        PalindromeEx T = new PalindromeEx();
        System.out.println(T.solution("A man a plan a canal Panama"));
    }

}
