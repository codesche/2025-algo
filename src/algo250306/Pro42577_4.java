package algo250306;

// 정렬을 활용한 풀이 - 효율성 테스트 성공, 정확성 테스트 실패

import java.util.Arrays;

public class Pro42577_4 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        boolean result = true;

        int length = phone_book.length;
        for (int i = 0; i < length - 1; i++) {
            if (phone_book[i + 1].contains(phone_book[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
}
