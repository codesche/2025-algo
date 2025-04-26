package algo250426;

public class PalindromeEx_refactor {
    public boolean solution(String s) {
        s = s.toLowerCase();            // 한 번만 소문자로 변환

        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                cleaned.append(c);
            }
        }

        String str = cleaned.toString();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeEx_refactor T = new PalindromeEx_refactor();
        System.out.println(T.solution("A man a plan a canal Panama"));
    }

}
