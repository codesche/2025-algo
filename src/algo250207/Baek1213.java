package algo250207;

import java.io.*;

// 팰린드롬 만들기 - 실버 3
// 홀수 번 등장한 알파벳이 두 개 이상인 경우 return "I'm Sorry Hansoo"
// 홀수 번 등장한 알파벳이 한 개인 경우 저장
// 등장한 알파벳은 사전 순서대로 절반 생성
// 홀수 번 등장한 알파벳이 있으면 중앙에 추가
// 절반을 생성한 팰린드롬을 reverse()를 이용하여 뒤집고 추가

public class Baek1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문자열 입력
        String str = br.readLine();
        String palindrome = createPalindrome(str);     // 함수로 팰린드롬 케이스 처리
        bw.write(palindrome);

        br.close();
        bw.flush();
        bw.close();
    }

    public static String createPalindrome(String name) {
        int[] alphabetCount = new int[26];              // 알파벳 등장 횟수 저장할 배열

        // 입력된 이름에서 각 알파벳의 등장 횟수를 세어 배열에 저장
        for (char c : name.toCharArray()) {
            alphabetCount[c - 'A']++;
        }

        StringBuilder halfPalindrome = new StringBuilder();     // 팰린드롬의 절반을 저장할 문자열
        char oddCharacter = 0;                                  // 홀수 번 등장한 알파벳 저장할 변수

        // 각 알파벳 등장 횟수 확인하면서 팰린드롬의 절반을 구성
        for (int i = 0; i < 26; i++) {
            // 홀수 번 등장한 알파벳이 두 개 이상일 경우 팰린드롬 생성 불가능
            if (alphabetCount[i] % 2 == 1) {
                if (oddCharacter != 0) {
                    return "I'm Sorry Hansoo";
                }

                // 홀수 번 등장한 알파벳 저장
                oddCharacter = (char)('A' + i);
            }

            // 알파벳 등장 횟수의 절반을 이용하여 팰린드롬의 절반을 생성
            for (int j = 0; j < alphabetCount[i] / 2; j++) {
                halfPalindrome.append((char)('A' + i));
            }
        }

        StringBuilder palindrome = new StringBuilder(halfPalindrome.toString());

        // 홀수 번 등장한 알파벳이 있다면 중앙에 추가하여 전체 팰린드롬 생성
        if (oddCharacter != 0) {
            palindrome.append(oddCharacter);
        }

        // 팰린드롬의 절반을 뒤집어서 전체 팰린드롬 생성 - reverse() 활용
        // 만약에 reverse() 를 활용할 수 없다면 거꾸로 출력할 수 있는 반복문으로 구현
        palindrome.append(halfPalindrome.reverse());

        // 생성된 팰린드롬 반환
        return palindrome.toString();
    }

}
