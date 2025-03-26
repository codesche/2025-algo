package algo250326;

import java.io.*;

// 백준 - 학점계산 (브론즈 3)
public class Baek2754 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String[] arr = {"4.3", "4.0", "3.7", "3.3", "3.0",
                        "2.7", "2.3", "2.0", "1.7", "1.3",
                        "1.0", "0.7", "0.0"};

        switch (str) {
            case "A+":
                sb.append(arr[0]);
                break;
            case "A0":
                sb.append(arr[1]);
                break;
            case "A-":
                sb.append(arr[2]);
                break;
            case "B+":
                sb.append(arr[3]);
                break;
            case "B0":
                sb.append(arr[4]);
                break;
            case "B-":
                sb.append(arr[5]);
                break;
            case "C+":
                sb.append(arr[6]);
                break;
            case "C0":
                sb.append(arr[7]);
                break;
            case "C-":
                sb.append(arr[8]);
                break;
            case "D+":
                sb.append(arr[9]);
                break;
            case "D0":
                sb.append(arr[10]);
                break;
            case "D-":
                sb.append(arr[11]);
                break;
            case "F":
                sb.append(arr[12]);
                break;
        }

        System.out.println(sb);
    }
}
