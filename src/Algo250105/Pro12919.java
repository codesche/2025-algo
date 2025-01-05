package Algo250105;

// 서울에서 김서방 찾기
public class Pro12919 {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        int length = seoul.length;

        // for문 + 배열 요소
        for (int i = 0; i < length; i++) {
            if (seoul[i].contains("Kim")) {
                sb.append("김서방은")
                    .append(" ")
                    .append(seoul[i])
                    .append("에 있다");
            }
        }

        return sb.toString();
    }
}
