package algo250422;

import java.io.*;
import java.util.*;

// 근무 시간 - Lv1
public class Softeer6254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalHour = 0;
        int min = 0;

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] morning = st.nextToken().split(":");
            String[] evening = st.nextToken().split(":");
            int morningHour = Integer.parseInt(morning[0]);
            int eveningHour = Integer.parseInt(evening[0]);
            int morningMin = Integer.parseInt(morning[1]);
            int eveningMin = Integer.parseInt(evening[1]);

            if (morningMin > eveningMin) {
                min += 60 - morningMin + eveningMin;
                totalHour += eveningHour - morningHour - 1;
            } else {
                min += eveningMin - morningMin;
                totalHour += eveningHour - morningHour;
            }
        }

        System.out.print((totalHour * 60) + min);
    }
}
