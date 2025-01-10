package algo250110;

public class StringBuilderEx {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("abc");                             // 문자열 추가
        sb.insert(2, "dd");              // 인덱스 2 위치에 dd 추가
        System.out.println(sb.toString());

        sb.delete(0, 2);                             // 0 ~ 1 사이 인덱스에 위치한 문자열 삭제
        System.out.println(sb.toString());

        sb.deleteCharAt(2);                  // 인덱스 2에 위치한 문자열 삭제
        System.out.println(sb.toString());

        sb.setCharAt(0, 'f');           // 인덱스 0에 위치한 문자를 f로 변경
        System.out.println(sb.toString());

        sb.reverse();                               // 문자열 뒤집기

        sb.append("abc");
        System.out.println(sb.toString());

        sb.setLength(3);        // 문자열 길이를 3으로 줄임
        System.out.println(sb.toString());

        sb.setLength(4);        // 문자열 길이가 늘어나지 않음! 기존의 길이인 3으로 유지
        System.out.println(sb.toString());
    }
}
