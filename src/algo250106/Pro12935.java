package algo250106;

// 제일 작은 수 제거하기
public class Pro12935 {
    public int[] solution(int[] arr) {
        // 배열 길이가 1일 때
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 배열 길이가 1 이상일 때
        int min = arr[0];           // 수 하나를 최솟값으로 지정
        int length = arr.length - 1;
        int[] answer = new int[length];

        // 최솟값 비교
        for (int value : arr) {
            min = Math.min(min, value);
        }

        // 최솟값을 제외한 요소들만 answer 배열에 추가
        int idx = 0;
        for (int realValue : arr) {
            if (realValue != min) {
                answer[idx++] = realValue;
            }
        }

        return answer;
    }
}
