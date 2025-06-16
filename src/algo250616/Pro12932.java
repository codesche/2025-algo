package algo250616;

import java.util.Arrays;

// 프로그래머스 - 자연수 뒤집어 배열로 만들기 (Lv1)
public class Pro12932 {
     public int[] solution(long n) {
         String str = String.valueOf(n);
         int length = str.length();
         int[] answer = new int[length];
         for (int i = 0; i < length; i++) {
             answer[i] = str.charAt(length - i - 1) - '0';
         }

         return answer;
     }

     public static void main(String[] args) {
         Pro12932 p = new Pro12932();
         System.out.println(Arrays.toString(p.solution(54321)));
     }
}
