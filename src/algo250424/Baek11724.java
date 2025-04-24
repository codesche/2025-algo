package algo250424;

import java.io.*;
import java.util.*;

// 백준 - 연결 요소의 개수 (실버 2)
public class Baek11724 {
    static boolean visited[];       // 방문 기록 저장 배열
    static ArrayList<Integer>[] A;  // 그래프 데이터 저장 인접 리스트
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());       // 노드 개수
        int m = Integer.parseInt(st.nextToken());       // 에지 개수
        visited = new boolean[n + 1];                   // 0번 사용 X
        A = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);            // 양방향 에지이므로 양쪽에 에지 더하기
            A[e].add(s);
        }

        int count = 0;                  // 정답 변수
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if (visited[v]) {           // 이미 방문한 노드일 경우 리턴
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {        // 연결 노드 중 방문하지 않았던 노드만 탐색
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
