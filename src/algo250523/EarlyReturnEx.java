package algo250523;

// 조기 반환
public class EarlyReturnEx {
    public static void main(String[] args) {
        System.out.println(totalPrice(4, 50));
    }

    static int totalPrice(int quantity, int price) {
        int total = quantity * price;
        if (total > 100) {
            return (int)(total * 0.9);      // 조기 반환
        }
        return total;
    }
}
