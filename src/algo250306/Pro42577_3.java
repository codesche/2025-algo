package algo250306;

// startsWith 활용 코드 - 효율성 테스트에서 시간 초과 발생
public class Pro42577_3 {
    public boolean solution(String[] phone_book) {
        int length = phone_book.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (phone_book[i].startsWith(phone_book[j])) {
                    return false;
                }

                if (phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
