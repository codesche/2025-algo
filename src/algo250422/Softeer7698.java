package algo250422;

import java.io.*;

// 개표 - Lv1
public class Softeer7698 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            for (int j = 0; j < n; j++) {
                count++;

                if (count == 5) {
                    sb.append("++++").append(" ");
                    count = 0;
                }
            }

            if (count % 5 != 0) {
                sb.append("|".repeat(count % 5));
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
