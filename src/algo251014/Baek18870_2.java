package algo251014;

import java.io.*;
import java.util.*;

public class Baek18870_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        Set<Integer> set = new LinkedHashSet<>();
        for (int x : sorted) {
            set.add(x);
        }

        // 중복이 제거된 값들을 차례로 리스트에 옮겨 담기
        List<Integer> list = new ArrayList<>(set);

        // 고유 값(작은 값일수록 앞쪽)에 순서대로 압축 인덱스 부여
        Map<Integer, Integer> rank = new HashMap<>(list.size() * 2);

        int size = list.size();
        for (int i = 0; i < size; i++) {
            rank.put(list.get(i), i);
        }

        // 원본 순서대로 압축된 좌표 출력
        for (int i = 0; i < N; i++) {
            sb.append(rank.get(arr[i])).append(' ');
        }

        System.out.println(sb);
    }
}
