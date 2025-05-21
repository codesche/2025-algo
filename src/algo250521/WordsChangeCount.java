package algo250521;

// PCCP 준비 - 단어 변환 횟수
// 시작 단어, 목표 단어, 단어 리스트가 주어질 때, 한 번에 한 글자씩 바꿔가며 목표 단어로 변환하는 최소 횟수를 구하기
public class WordsChangeCount {
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        return dfs(begin, target, words, visited, 0);
    }

    private int dfs(String current, String target, String[] words, boolean[] visited, int depth) {
        if (current.equals(target)) return depth;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && canConvert(current, words[i])) {
                visited[i] = true;
                int result = dfs(words[i], target, words, visited, depth + 1);
                if (result != 0) min = Math.min(min, result);
                visited[i] = false;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    private boolean canConvert(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) diff++;
        }
        return diff == 1;
    }

}
