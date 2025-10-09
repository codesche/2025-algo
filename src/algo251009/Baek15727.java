package algo251009;

import java.io.*;

// 백준 - 브론즈 5 (조별과제를 하려는데 조장이 사라졌다), [14268 KB, 104 ms]
public class Baek15727 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        int min = L / 5;
        if (L % 5 != 0) {
            min++;
        }

        System.out.println(min);
    }

}
