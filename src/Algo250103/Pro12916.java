package Algo250103;

// 문자열 내 p와 y의 개수
public class Pro12916 {
    boolean solution(String s) {
        // 문자열 모두 소문자로 변환
        s = s.toLowerCase();

        int ps = s.length() - s.replace("p", "").length();      // p의 개수
        int ys = s.length() - s.replace("y", "").length();      // y의 개수

        return ps == ys;        // 같으면 true 다르면 false를 반환
    }
}
