package algo250312;

// 큰 수 만들기 - Lv2 (실패)
public class Pro42883_2 {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int max = 0;
        int length = number.length();
        for (int i = 0; i < length - k; i++) {
            max = 0;
            for (int j = idx; j <= k + i; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    idx = j + 1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Pro42883_2 T = new Pro42883_2();
        System.out.println(T.solution("1924", 2));
    }
}
