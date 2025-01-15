package algo250115;

// 복호화 - 브론즈 2
// 진행 중...
import java.io.*;

public class Baek9046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());                    // 정수 입력

        for (int i = 0; i < N; i++) {
            int[] alphabet = new int[26];                           // a ~ z 까지 저장
            char[] arr = br.readLine().toCharArray();               // 문자열을 char 배열로 저장

            // 각 문자의 빈도수 계산 - 아스키 코드 활용하여 알파벳 배열에 추가
            for (char value : arr) {
                if (value >= 'a' && value <= 'z') {                         // 소문자 알파벳 범위 확인
                    alphabet[value - 'a']++;                            // 인덱스 출력
                }
            }

            // 가장 많이 나타나는 알파벳의 빈도수 찾기
            int max = 0;
            for (int count : alphabet) {
                if (count > max) {      // count가 max 보다 크다면 max값을 count로 업데이트
                    max = count;
                }
            }

            // 가장 많이 나타나는 알파벳의 개수 세기
            int count = 0;                              // 알파벳의 개수
            int answer = 0;                             // 알파벳의 인덱스
            for (int j = 0; j < 26; j++) {              // 알파벳 개수만큼 순회
                if (alphabet[j] == max) {               // 가장 자주 나타나는 알파벳 == 알파벳의 인덱스
                    count++;                            // 알파벳 개수 증가
                    answer = j;                         // 가장 많이 나타나는 빈도를 가진 알파벳의 인덱스 저장
                }
            }

            // 결과 문자열을 StringBuilder 에 추가
            // count가 1일 때와 그렇지 않을 경우 다른 값 선택하기
            // answer 인덱스를 알파벳으로 변환 (answer: 0 = a+0 = a, answer: 1 = a+1 = b)
            // count가 1일 경우 sb 추가
            // 그렇지 않을 경우 ? 출력
            // System.lineSeparator() : 개행
            sb.append(count == 1 ? (char)('a' + answer) : "?").append(System.lineSeparator());
        }
        // 문자열로 결과 출력
        System.out.print(sb.toString());
    }
}
