package algo250523;

import java.util.*;

// 보호 구문 - 본격적인 로직 진행 전 예외 처리 코드 추가,
// 조건문 이용하여 입력값 유효한지 검사하고 그렇지 않을 경우 바로 함수 종료
public class SelfDefenseEx {
    public double solution(List<Integer> numbers) {
        if (numbers == null) {          // null 이면 종료(예외)
            return 0;
        }

        if (numbers.isEmpty()) {        // 데이터가 없으면 종료(예외)
            return 0;
        }

        int total = numbers.stream().mapToInt(i -> i).sum();        // 예외 처리 후 기능 구현
        return (double) total / numbers.size();
    }
}
