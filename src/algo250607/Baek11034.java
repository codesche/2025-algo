package algo250607;

import java.io.*;
import java.util.*;

// 백준 - 캥거루 세마리2
public class Baek11034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int max = Math.max((b - a), (c - b));

            System.out.println(max - 1);
        }
    }
}
