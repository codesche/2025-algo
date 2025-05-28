package algo250528.info;

// 배열 합계
public class Exercise2 {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 11};
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        System.out.println("합계 : " + sum);
    }
}
