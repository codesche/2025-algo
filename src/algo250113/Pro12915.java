package algo250113;

import java.util.*;

// 문자열 내 마음대로 정렬하기 - Lv1
public class Pro12915 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();

        // 문자열 요소들 앞에 인덱스 n번째 글자를 더해서 리스트에 추가
        for (String value : strings) {
            list.add(value.charAt(n) + value);
        }

        // 오름차순 정렬
        Collections.sort(list);

        int length = list.size();
        for (int i = 0; i < length; i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }
}
