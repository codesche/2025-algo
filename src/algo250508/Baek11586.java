package algo250508;

import java.io.*;

// 백준 - 지영 공주님의 마법 거울 (브론즈 3)
// 1 - 있는 그대로 표현, 2 - 좌/우 반전 (y축 대칭 이동), 3 - 상/하 (x축 대칭 이동) 반전
public class Baek11586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int mind = Integer.parseInt(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            String line = arr[i];
            String reverseLine = arr[arr.length - i - 1];
            for (int j = 0; j < line.length(); j++) {
                if (mind == 1) {
                    sb.append(line.charAt(j));
                } else if (mind == 2) {
                    sb.append(line.charAt(line.length() - j - 1));
                } else if (mind == 3) {
                    sb.append(reverseLine.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
