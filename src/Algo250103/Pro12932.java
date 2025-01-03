package Algo250103;

// 자연수 뒤집어 배열로 만들기
public class Pro12932 {
    public int[] solution(long n) {
        // 입력받은 숫자 문자열로 반환 - "12345"
        String str = Long.toString(n);

        // 문자열을 뒤집는다 - "54321"
        String reversed = new StringBuilder(str).reverse().toString();

        // 뒤집힌 문자열을 문자 배열로 변환 => ['5', '4', '3', '2', '1']
        char[] arr = reversed.toCharArray();

        // 배열의 각 문자를 정수로 반환
        int length = arr.length;
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            answer[i] += arr[i] - '0';
        }

        return answer;
    }
}
