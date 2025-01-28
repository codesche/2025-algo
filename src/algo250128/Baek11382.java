package algo250128;

import java.io.*;
import java.util.*;

// 꼬마 정민 - 브론즈 5

public class Baek11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        System.out.println(a + b + c);
    }
}
