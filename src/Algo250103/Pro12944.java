package Algo250103;

// 평균 구하기
public class Pro12944 {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        int length = arr.length;

        for (int value : arr) {
            sum += value;
        }

        answer = (double)sum / length;
        return answer;
    }
}
