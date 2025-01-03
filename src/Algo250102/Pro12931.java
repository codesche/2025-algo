package Algo250102;

// 자릿수 더하기 - 123, 987
public class Pro12931 {
    public int solution(int n) {
        int answer = 0;

        // 문자열 변환
        String str = String.valueOf(n);

        // 배열 생성
        String[] arr = str.split("");

        // 향상된 for 문 활용
        for (String value : arr) {
            answer += Integer.parseInt(value);
        }

        return answer;
    }
}
