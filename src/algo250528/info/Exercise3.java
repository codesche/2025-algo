package algo250528.info;

import java.util.*;

// 문자열 뒤집기
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        System.out.println(sb.reverse().toString());
    }
}
