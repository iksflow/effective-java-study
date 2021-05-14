package items.item01;

import java.math.BigInteger;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BigInteger n = BigInteger.probablePrime(8, new Random(4));
        System.out.println(n);
    }
}
