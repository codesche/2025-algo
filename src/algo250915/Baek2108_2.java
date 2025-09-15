package algo250915;

import java.util.*;
import java.io.*;

// 백준 - 통계학, 다른 풀이
public class Baek2108_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        long sum = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        // 오름차순 정렬
        Arrays.sort(arr);

        int mean = (int) Math.round((double) sum / N);
        int median = arr[N / 2];
        int maxFreqValue = maxFreqValueWithMap(freqMap);
        int range = arr[N - 1] - arr[0];

        StringBuilder sb = new StringBuilder();
        sb.append(mean).append('\n')
            .append(median).append('\n')
            .append(maxFreqValue).append('\n')
            .append(range).append('\n');

        System.out.print(sb);
    }


    // HashMap 활용
    private static int maxFreqValueWithMap(Map<Integer, Integer> freqMap) {
        int maxFreq = 0;
        for (int f : freqMap.values()) {
            if (f > maxFreq) {
                maxFreq = f;
            }
        }

        List<Integer> candidates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                candidates.add(entry.getKey());
            }
        }

        Collections.sort(candidates);
        return candidates.size() == 1 ? candidates.get(0) : candidates.get(1);
    }

    // PriorityQueue 활용
    private static int maxFreqValueWithPQ(Map<Integer, Integer> freqMap) {
        int maxFreq = 0;
        for (int f : freqMap.values()) {
            maxFreq = Math.max(maxFreq, f);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                pq.offer(entry.getKey());
            }
        }

        if (pq.size() == 1) {
            return pq.peek();
        }

        pq.poll();

        return pq.peek();
    }

}
