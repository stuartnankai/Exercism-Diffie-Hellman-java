import java.math.BigInteger;

public class DiffieHellman {

    BigInteger privateKey(BigInteger prime) {

        double d = Math.random();
        int a = (int) (d * prime.intValue());
        return BigInteger.valueOf(a);
    }

    BigInteger publicKey(BigInteger primeA, BigInteger primeB, BigInteger privateKey) {
        // A = g**a mod p
        // prime numbers p and g.
        //Alice picks a private key, a, greater than 1 and less than p. Bob does the same to pick a private key b.

        return primeB.modPow(privateKey, primeA);
    }

    BigInteger secret(BigInteger prime, BigInteger publicKey, BigInteger privateKey) {

        return publicKey.modPow(privateKey, prime);

    }

}
