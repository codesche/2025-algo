package Algo250103;

import java.util.Arrays;

// x만큼 간격이 있는 숫자
public class Pro12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long length = answer.length;
        int value = x;

        for (int i = 0; i < length; i++) {
            answer[i] = value;
            value += x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro12954 T = new Pro12954();
        System.out.println(Arrays.toString(T.solution(2, 5)));
    }

}
