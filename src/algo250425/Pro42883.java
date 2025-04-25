package algo250425;

// 프로그래머스 - 큰 수 만들기 (Lv2)
public class Pro42883 {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        char[] arr = number.toCharArray();
        int length = arr.length - k;

        // 문자 비교 시작 인덱스
        int start = 0;

        for (int i = 0; i < length; i++) {
            char max = '0';
            for (int j = start; j <= i + k; j++) {
                // 가장 큰 수를 선택하여 그 다음 인덱스를 시작 인덱스로 설정
                if (arr[j] > max) {
                    max = arr[j];
                    start = j + 1;
                }
            }
            sb.append(max);     // 가장 큰 문자를 String에 넣기
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Pro42883 T = new Pro42883();
        System.out.println(T.solution("1231234", 3));
    }
}
