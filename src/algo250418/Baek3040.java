package algo250418;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 백준 - 백설 공주와 일곱 난쟁이 (브론즈 2)
public class Baek3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            list.add(Integer.parseInt(br.readLine()));
            sum += list.get(i);
        }

        int targetValue = sum - 100;

        loop:
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
               if (list.get(i) + list.get(j) == targetValue) {
                   list.remove(i);
                   list.remove(j - 1);
                   break loop;
               }
            }
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(list.get(i));
        }
    }
}
