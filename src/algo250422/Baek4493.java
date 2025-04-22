package algo250422;

import java.io.*;
import java.util.*;

// 백준 - 가위 바위 보? (브론즈 3)
// R - 바위, P - 보, S - 가위
// 가위 바위 보 경우의 수 :
/*
가위 가위(비김), 가위 바위, 가위 보
바위 가위, 바위 바위(비김), 바위 보
보 가위, 보 보(비김), 보 바위
 */
public class Baek4493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int count1 = 0;
            int count2 = 0;

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String player1 = st.nextToken();
                String player2 = st.nextToken();

                if (player1.equals("R")) {              // 바위
                    switch (player2) {
                        case "R":
                            count1++;
                            count2++;
                            break;
                        case "P":    // 보
                            count2++;
                            break;
                        case "S":    // 가위
                            count1++;
                        default:
                            break;
                    }
                } else if (player1.equals("P")) {       // 보
                    switch (player2) {
                        case "R":           // 바위
                            count1++;
                            break;
                        case "P":           // 보
                            count1++;
                            count2++;
                            break;
                        case "S":           // 가위
                            count2++;
                            break;
                        default:
                            break;
                    }
                } else if (player1.equals("S")) {       // 가위
                    switch (player2) {
                        case "R":           // 바위
                            count2++;
                            break;
                        case "P":           // 보
                            count1++;
                            break;
                        case "S":
                            count1++;
                            count2++;
                            break;
                        default:
                            break;
                    }
                }
            }

            if (count1 > count2) {
                System.out.println("Player 1");
            } else if (count2 > count1) {
                System.out.println("Player 2");
            } else {
                System.out.println("TIE");
            }
        }
    }
}
