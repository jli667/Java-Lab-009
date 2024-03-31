import java.math.BigInteger;
public class BigIntRewrite {

    public static BigInteger pow(int x, int n) {
        if (n==0) return BigInteger.valueOf(1);

        BigInteger a = pow(x, n/2);

        if (n%2 == 0) {
            return a.multiply(a);
        }
        else {
            return a.multiply(a).multiply(BigInteger.valueOf(x));
        }
    }
    public static void main(String[] args) {

    }
}
