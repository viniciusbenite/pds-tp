package strategy_problem;

import java.security.NoSuchAlgorithmException;

public class CipherClass {

    String stringToEncrypt;

    public CipherClass(String stringToEncrypt) {
        this.stringToEncrypt = stringToEncrypt;
    }

    public void cipher(CipherInterface cipherMethod) throws NoSuchAlgorithmException {
        cipherMethod.cipher(stringToEncrypt);
    }
}
