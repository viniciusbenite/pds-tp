package strategy_problem;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class Sha256 implements CipherInterface {

    public static byte[] getSHA(String stringToCipher) throws NoSuchAlgorithmException
    {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return md.digest(stringToCipher.getBytes(StandardCharsets.UTF_8));
    }

    public static String toHexString(byte[] hash)
    {
        BigInteger number = new BigInteger(1, hash);
        StringBuilder hexString = new StringBuilder(number.toString(16));
        while (hexString.length() < 32)
        {
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }

    @Override
    public void cipher(String stringToCipher) throws NoSuchAlgorithmException {
        String encryptedString = null;
        try {
            encryptedString = toHexString(getSHA(stringToCipher));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        System.out.printf("String %s encrypted using SHA-256: %s\n", stringToCipher, encryptedString);
    }
}
