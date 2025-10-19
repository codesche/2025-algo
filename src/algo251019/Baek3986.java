package algo251019;

import java.io.*;
import java.util.Stack;

// 백준 - 좋은 단어 (실버 4)
public class Baek3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 단어 위로 아치형 곡선을 그어 같은 글자끼리(A는 A끼리, B는 B끼리) 쌍을 짓는다.
        // 선끼리 교차하지 않으면서 각 글자를 정확히 한 개의 다른 위치에 있는 같은 글자와 짝 지을수 있다면 그 단어는 '좋은 단어' => 이게 이해가 안 됨
        // ABBA: 가운데 두 B가 서로 짝을 이룸, 바깥의 A 두 개가 서로 짝을 이룸 => 좋은 단어
        // AABB: 첫 번째 A와 두 번째 A 짝, 첫 번째 B와 두 번째 B 짝 => 이것도 교차 없이 가능, 좋은 단어
        // ABAB: 첫 번째 A와 세 번째 A를 짝짓고, 첫 번째 B와 네 번째 B를 짝지으면 선이 교차함, 좋은 단어가 아님
        int count = 0;
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (char ch : word.toCharArray()) {
                if (!stack.isEmpty() && ch == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }

            if (stack.isEmpty()) {
                count++;
            }
        }

        System.out.println(count);
    }
}
