package algo250622;

// 프로그래머스 - 문자열 내 p와 y의 개수 (Lv1)
public class Pro12916 {
    boolean solution(String s) {
        s = s.toUpperCase();        // 대소문자 구분 x

        int ps = s.length() - s.replace("P", "").length();        // p를 빈칸 처리
        int ys = s.length() - s.replace("Y", "").length();        // y를 빈칸 처리

        return ps == ys;
    }
}
