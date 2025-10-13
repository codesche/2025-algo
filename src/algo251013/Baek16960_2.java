package algo251013;

import java.io.*;
import java.util.*;

// 시간: O(N + E), E = 스위치-램프 연결 총 개수
// 공간: O(M + E)
public class Baek16960_2 {

    static int N;
    static int M;
    static int[] controlCount;                  // controlCount[l] = 램프 l을 켤 수 있는 스위치 수
    static List<Integer>[] switches;            // switches[i] = i번 스위치가 켜는 램프 목록

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        controlCount = new int[M + 1];
        switches = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            switches[i] = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());       // i번 스위치가 제어하는 램프 개수
            while (k-- > 0) {
                int lamp = Integer.parseInt(st.nextToken());
                switches[i].add(lamp);
                controlCount[lamp]++;       // 램프를 켤 수 있는 스위치 수 누적
            }
        }

        // 어떤 스위치든 "유일하게 켜는 램프"가 없다면 그 스위치를 꺼도 전부 켜짐
        for (int i = 1; i <= N; i++) {
            if (isRemovable(i)) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }

    // 스위치 idx를 꺼도 모든 램프가 켜지는지 여부를 확인
    private static boolean isRemovable(int idx) {
        for (int lamp : switches[idx]) {
            // 이 램프를 켤 수 있는 스위치가 idx 하나뿐이면 제거 불가
            if (controlCount[lamp] == 1) {
                return false;
            }
        }
        return true;
    }

}
