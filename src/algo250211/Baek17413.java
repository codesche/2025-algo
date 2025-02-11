package algo250211;

import java.io.*;
import java.util.*;

// 단어 뒤집기 2 - 실버 3
// 공백을 기준으로 단어를 나눈다
public class Baek17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        boolean flag = false;                   // 열린 꺽새, 닫힌 꺽새 판별 위한 flag

        // 후입 선출 위한 Stack 활용
        Stack<Character> stack = new Stack<>();

        // 문자열 길이 만큼 반복문 수행
        int length = str.length();
        for (int i = 0; i < length; i++) {
            // 열린 꺽새를 만났다면, stack이 비어있지 않을 경우 모든 원소를 꺼내고 flag를 true로 변환
            if (str.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                flag = true;
            } else if (str.charAt(i) == '>') {      // 닫힌 꺽새를 만났을 경우, flag를 false로 입력 후 '>' 저장
                flag = false;
                sb.append(str.charAt(i));
                continue;
            }

            // flag가 true인 경우, '>'를 만나기 전까지 그대로 입력
            if (flag == true) {
                sb.append(str.charAt(i));
            } else {        // false 인 경우, 괄호 이외의 문자 처리
                // 해당 인덱스의 i번째 문자가 공백인 경우, 모든 원소를 pop하고 공백 추가
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    // 그 외, stack에 문자 추가
                    stack.push(str.charAt(i));
                }
            }

            // 반복문이 마지막 횟수일 때, 스택이 비어있지 않으면 원소 추가하기
            if (i == length - 1) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }
        System.out.print(sb);
    }
}
