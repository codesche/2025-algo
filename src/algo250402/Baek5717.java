package algo250402;

import java.io.*;
import java.util.*;

public class Baek5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = 1;
        int f = 1;

        while (m != 0 && f != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken());
            f = Integer.parseInt(st.nextToken());

            if (m == 0 && f == 0) {
                break;
            }

            System.out.println(m + f);
        }
    }
}
