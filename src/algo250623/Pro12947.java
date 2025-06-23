package algo250623;

// 프로그래머스, 하샤드 수 (Lv1)
public class Pro12947 {
    public boolean solution(int x) {
        boolean answer = true;

        // 문자열 변환
        String str = String.valueOf(x);

        // 문자 배열
        char[] arr = str.toCharArray();
        int total = 0;
        for (char num : arr) {
            total += num - '0';
        }

        answer = (x % total == 0 ? true : false);

        return answer;
    }
}
