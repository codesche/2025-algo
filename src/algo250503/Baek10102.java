package algo250503;

import java.io.*;

// 백준 - 개표 (브론즈 3)
public class Baek10102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        String vote = br.readLine();

        int aCount = 0;
        int bCount = 0;

        for (int i = 0; i < v; i++) {
            if (vote.charAt(i) == 'A') {
                aCount++;
            } else if (vote.charAt(i) == 'B') {
                bCount++;
            }
        }

        StringBuilder sb = new StringBuilder();
        if (aCount > bCount) {
            sb.append("A");
        } else if (aCount < bCount) {
            sb.append("B");
        } else {
            sb.append("Tie");
        }

        System.out.println(sb);
    }
}
