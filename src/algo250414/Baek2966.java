package algo250414;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 백준 - 찍기 (브론즈 2)
public class Baek2966 {

    private static final String[] person1 = {"A", "B", "C"};
    private static final String[] person2 = {"B", "A", "B", "C"};
    private static final String[] person3 = {"C", "C", "A", "A", "B", "B"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String answer = br.readLine();

        int correct1 = 0;
        int correct2 = 0;
        int correct3 = 0;

        for (int i = 0; i < N; i++) {
            char temp = answer.charAt(i);
            if (person1[i % person1.length].charAt(0) == temp) correct1++;
            if (person2[i % person2.length].charAt(0) == temp) correct2++;
            if (person3[i % person3.length].charAt(0) == temp) correct3++;
        }

        int max = Math.max(correct1, Math.max(correct2, correct3));
        System.out.println(max);

        if (correct1 == max) sb.append("Adrian\n");
        if (correct2 == max) sb.append("Bruno\n");
        if (correct3 == max) sb.append("Goran\n");

        System.out.println(sb);
    }
}
