package algo250203;

import java.io.*;
import java.util.*;

// 듣보잡 - 실버 4
public class Baek1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<String> list = new ArrayList<>();
        int N = Integer.parseInt(st.nextToken());               // 듣도 못한 사람
        int M = Integer.parseInt(st.nextToken());               // 보도 못한 사람

        HashMap<String, Integer> map = new HashMap<>();
        // 듣도 못한 사람
        for (int i = 0; i < N; i++) {
            String name1 = br.readLine();
            map.put(name1, map.getOrDefault(name1, 1));
        }

        // 보도 못한 사람
        for (int i = 0; i < M; i++) {
            String name2 = br.readLine();

            if (map.containsKey(name2)) {
                list.add(name2);
            }
        }

        Collections.sort(list);

        int size = list.size();
        bw.write(size + "\n");
        for (String value : list) {
            bw.write(value + "\n");
        }

        bw.flush();
        bw.close();
    }
}
