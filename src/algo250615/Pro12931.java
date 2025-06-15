package algo250615;

// 프로그래머스 - 자릿수 더하기 (Lv1)
public class Pro12931 {
    public int solution(int n) {
        int answer = 0;
        int length = String.valueOf(n).length() - 1;

        while (length != 0) {
            answer += n / (int) Math.pow(10, length);
            n %= (int) Math.pow(10, length);
            length--;
        }

        answer += n;

        return answer;
    }

    public static void main(String[] args) {
        Pro12931 p = new Pro12931();
        System.out.println(p.solution(123));
    }
}
