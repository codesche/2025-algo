package algo250121;

import java.io.*;
import java.util.*;

// ABC - 브론즈 3
public class Baek3047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[3];

        // 배열에 담기
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // StringTokenizer 초기화 후 str 변수에 입력
        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        Arrays.sort(arr);

        for (int i = 0; i < 3; i++) {
            if ('A' == str.charAt(i)) {
                bw.write(arr[0] + " ");
            } else if ('B' == str.charAt(i)) {
                bw.write(arr[1] + " ");
            } else if ('C' == str.charAt(i)) {
                bw.write(arr[2] + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
