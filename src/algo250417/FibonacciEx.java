package algo250417;

// 피보나치수열, O(2^n)
public class FibonacciEx {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
