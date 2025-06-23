package algo250624;

// 프로그래머스 - 없는 숫자 더하기 (Lv1)
class Pro86051 {
    public int solution(int[] numbers) {
        int answer = 0;

        int[] arr = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            arr[numbers[i]]++;
        }

        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == 0) {
                answer += idx;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro86051 solution = new Pro86051();
        System.out.println(solution.solution(new int[]{1,2,3,4,5}));
    }

}
