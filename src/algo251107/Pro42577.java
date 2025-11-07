package algo251107;

// 한 번호가 다른 번호의 접두어인 경우가 있는지를 확인
// 가장 작은 길이의 문자열
// 이중 for 문과 해시맵을 활용하여 풀이
// HashMap<String, Boolean> map = new HashMap<>();

// 생각 정리
// 1. 눈으로, 손으로 풀 수 있는지부터 확인
// 2. 이중 for문
// 3. 접두어 -> startsWith or substring

import java.util.*;

// 프로그래머스 - 전화번호 목록(Lv2)
public class Pro42577 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        // 해시맵을 선언한 다음에 phone_book 배열의 전화번호의 인덱스를 해시맵에 넣는다.
        HashMap<String, Boolean> map = new HashMap<>();
        for (String number : phone_book) {
            map.put(number, true);
        }

        // 접두어 체크
        // phone_book을 돌면서 한 번호가 다른 번호의 접두사인지 체크
        // i를 0이 아닌 1부터 시작 -> ""는 map에 없으므로 쓸데없는 1회 체크 제거
        for (String s : phone_book) {
            for (int i = 1; i < s.length(); i++) {
                if (map.containsKey(s.substring(0, i))) {
                    return false;
                }
            }
        }

        return answer;
    }
}
