package algo250909;

import java.util.*;
import java.io.*;

// 백준 - 회의실 배정 (골드 5)
public class Baek1931 {

    static class Meeting {
        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Meeting[] arr = new Meeting[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[i] = new Meeting(s, e);
        }

        // 회의의 끝나는 시간 기준 오름차순 정렬 (끝나는 시간이 같다면 시작 시간이 빠른 것 먼저 진행)
        Arrays.sort(arr, (a, b) -> {
            if (a.end != b.end) {
                return Integer.compare(a.end, b.end);
            }
            return Integer.compare(a.start, b.start);
        });

        int count = 0;
        int lastEnd = 0;
        for (Meeting m : arr) {
            if (m.start >= lastEnd) {
                count++;
                lastEnd = m.end;
            }
        }

        System.out.println(count);
    }

}
