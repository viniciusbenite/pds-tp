package strategy_problem;

import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        CipherClass stringOne = new CipherClass("Hello World");
        CipherClass stringTwo = new CipherClass("someuserpass1234?/");

        stringOne.cipher(new Sha256());
        stringOne.cipher(new Sha512());
        stringOne.cipher(new Md5());

        stringTwo.cipher(new Sha256());
        stringTwo.cipher(new Sha512());
        stringTwo.cipher(new Md5());
    }
}
