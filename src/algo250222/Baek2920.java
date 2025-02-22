package algo250222;

import java.io.*;
import java.util.*;

// 음계 - 브론즈 2
public class Baek2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ascend = 0;                     // 7 이면 ascending
        int descend = 0;                    // 7 이면 descending
        for (int i = 0; i < 8; i++) {
            if (i != 7 && arr[i + 1] == arr[i] + 1) {
                ascend++;
            } else if (i != 7 && arr[i + 1] == arr[i] - 1) {
                descend++;
            } else {
                break;
            }
        }

        if (ascend == 7) {
            bw.write("ascending");
        } else if (descend == 7) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
