package algo250316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Back10797_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int day = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(st.nextToken());
            stack.push(number);

            if (stack.peek() != day) {
                stack.pop();
            }
        }

        System.out.println(stack.size());
    }
}
