package algo250316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Back10797_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int day = Integer.parseInt(br.readLine());
        int answer = 0;
        int idx = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(st.nextToken());
            list.add(number);

            if (list.get(idx) == day) {
                answer++;
            }
            idx++;
        }
        System.out.println(answer);
    }
}
