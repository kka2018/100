package p10;

import java.math.BigInteger;

public class LargeFactorial {

    public static BigInteger factorial(int N){
        BigInteger f = BigInteger.ONE;

        for(int i=2; i<=N; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }

        return f;
    }

    public static void main(String[] aR){
        System.out.print(factorial(100));
    }
}
