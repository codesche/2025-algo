package algo250312;

// 큰 수 만들기 - Lv2 (성공)
public class Pro42883_3 {
    public String solution(String number, int k) {
        // 각 자리에서 최고로 높은 수가 나오는 경우 생각하기
        String answer = "";
        StringBuilder sb = new StringBuilder();

        char[] arr = number.toCharArray();
        int length = arr.length - k;

        // 문자 비교 시작하는 인덱스 변수
        int start = 0;

        for (int i = 0; i < length; i++) {
            char max = '0';
            for (int j = start; j <= i + k; j++) {
                // 가장 큰 수를 골라서 그 다음 인덱스를 시작 인덱스로 설정하기
                if (arr[j] > max) {
                    max = arr[j];
                    start = j + 1;
                }
            }
            // 가장 큰 문자를 String에 넣기
            sb.append(max);
        }

        // k개의 수를 제거할 때 얻을 수 있는 가장 큰 숫자 구하기
        answer = sb.toString();
        return answer;
    }
}
