package algo250502;

import java.io.*;
import java.util.*;

// 백준 - 오르막 (브론즈 2)
public class Baek14910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] arr = str.split(" ");
        int[] numbers = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        boolean isAscending = true;
        for (int i = 1; i < arr.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                isAscending = false;
                break;
            }
        }

        System.out.println(isAscending ? "Good" : "Bad");
    }
}
