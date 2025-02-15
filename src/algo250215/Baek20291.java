package algo250215;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

// 파일 정리 - 실버 3
public class Baek20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split("\\.");
            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
        }

        // Map 정렬
        Map<String, Integer> sortedMap = new TreeMap<>(map);

        for (Entry<String, Integer> nameMap : sortedMap.entrySet()) {
            bw.write(nameMap.getKey() + " " + nameMap.getValue());
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
