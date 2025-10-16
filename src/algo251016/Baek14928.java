package algo251016;

import java.io.*;
import java.math.BigInteger;

// 백준 - 큰 수 (BIG), 브론즈 5 [299636 KB,	480 ms]
public class Baek14928 {
    public static void main(String[] args) throws IOException {
        final BigInteger MOD = BigInteger.valueOf(20000303);
        final BigInteger TEN = BigInteger.TEN;

        InputStream in = System.in;
        byte[] buf = new byte[1 << 16];         // 64KB 버퍼
        int read;
        BigInteger rem = BigInteger.ZERO;

        // 숫자만 읽어서 BigInteger로 (rem * 10 + digit) % MOD 갱신
        while ((read = in.read(buf)) != -1) {
            for (int i = 0; i < read; i++) {
                int b = buf[i] & 0xFF;
                if (b >= '0' && b <= '9') {
                    rem = rem.multiply(TEN)
                        .add(BigInteger.valueOf(b - '0'))
                        .mod(MOD);
                }
            }
        }

        System.out.print(rem.toString());
    }
}
