package algo250507;

import java.io.*;

// 백준 - 팬들에게 둘러싸인 홍준 (브론즈 5)
public class Baek14581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        sb.append(":fan::fan::fan:").append("\n");
        sb.append(":fan:").append(":").append(input).append("::fan:").append("\n");
        sb.append(":fan::fan::fan:");
        System.out.print(sb);
    }
}
