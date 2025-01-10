package algo250110;

import java.util.Arrays;

// 참고 : https://velog.io/@k__hyun/%EA%B0%9C%EB%85%90-JAVA-%EB%B2%BC%EB%9D%BD%EC%B9%98%EA%B8%B0
public class StringExample {

    public static void main(String[] args) {
        String my_str = "abcdef";

        // 문자열의 길이
        my_str.length();
        my_str.isEmpty();       // 길이가 0이면 True, 아니면 False 반환

        // 문자열 자르기
        my_str.split("c");      // 분리할 문자열 기준
        my_str.split("");       // 띄어쓰기 없는 문자열

        System.out.println(Arrays.toString(my_str.split("c", 1)));       // 분리할 문자열 기준, 배열의 크기 한정
        System.out.println(my_str.split("c")[0]);           // ab 출력

        System.out.println("=== 반복문으로 자른 문자열의 배열 ===");
        String[] str1 = my_str.split("");
        for (String s : str1) {
            System.out.println(s);
        }

        // substring 함수
        my_str.substring(2);    // 해당 Index 문자열부터 출력 : "cdef" 출력
        my_str.substring(0, 2);             // start idx ~ end idx -1 까지 출력 : "ab" 출력

        // for 문 사용
        System.out.println("=== for 문 사용 ===");
        for (int i = 0; i < my_str.length(); i++) {
            System.out.println(my_str.charAt(i));
        }

        // 대소문자 변경
        String str = "Hello WOrlD";
        str = str.toUpperCase();
        str = str.toLowerCase();

        char c = 'c';
        c = Character.toUpperCase(c);
        c = Character.toLowerCase(c);

        /*char의 대소문자 확인*/
        char letter = 'a';
        Character.isLowerCase(letter);                  // 소문자니까 true 반환

        // 문자열 비교
        String s = "Starbucks";
        s.equals("Starbucks");                          // 같으므로 true, 아니면 false 반환
        s.equalsIgnoreCase("sta");       // 문자열 간의 대소문자를 무시하고 비교 후 값 반환
        s.contains("buck");                             // 포함되니까 True, 아니면 False 반환

        s.startsWith("S");                               // S로 시작하는지
        s.endsWith("ks");                                // ks로 시작하는지

        // 위치 찾기
        System.out.println("=== 위치 찾기 ===");
        String text = "Hello, world!";
        int index1 = text.indexOf("world");                     // 문자열이 처음 나타나는 위치의 인덱스 반환: 7 출력
        int index2 = text.indexOf('o');                         // 주어진 문자가 처음 나타나는 인덱스 반환: 4 출력
        int index3 = text.indexOf('o', 5);      // 'o' 라는 문자/문자열이 주어진 인덱스 5 이후에 처음으로 나타나는 인덱스 반환: 8 출력
        int index4 = text.lastIndexOf("o");                // "o" 문자의 마지막 인덱스 반환: 8 출력

        System.out.println(index3);
        System.out.println(index4);

        // 형변환
        Integer.parseInt("320");            // 문자 -> 숫자
        Integer.toString(320);              // 숫자 -> 문자

        // 문자열 뒤집기
        System.out.println("=== 문자열 뒤집기 ===");
        String tempStr = "hello";
        String sb = new StringBuilder(tempStr).reverse().toString();
    }
}
