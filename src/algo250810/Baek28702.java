package algo250810;

import java.io.*;
import java.util.*;

// 백준 - FizzBuzz (브론즈 1)
public class Baek28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {
            br.readLine(),
            br.readLine(),
            br.readLine()
        };

        // case 1: at least one numeric anchor exists
        for (int i = 0; i < 3; i++) {
            if (isNum(arr[i])) {
                long v = Long.parseLong(arr[i]);
                long next = v + (3 - i);
                System.out.println(fb(next));
                return;
            }
        }

        // Case 2: all are Fizz/Buzz/FizzBuzz
        for (int base = 1; base <= 15; base++) {
            boolean ok = true;
            for (int i = 0; i < 3 && ok; i++) {
                String want = fb(base + i);
                ok = want.equals(arr[i]);
            }
            if (ok) {
                System.out.println(fb(base + 3));
                return;
            }
        }

    }

    private static boolean isNum(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') return false;
        }
        return true;
    }

    private static String fb(long x) {
        boolean f = (x % 3 == 0);
        boolean b = (x % 5 == 0);
        if (f && b) return "FizzBuzz";
        if (f) return "Fizz";
        if (b) return "Buzz";
        return Long.toString(x);
    }
}
