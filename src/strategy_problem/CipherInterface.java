package strategy_problem;

import java.security.NoSuchAlgorithmException;

public interface CipherInterface {
    void cipher(String string) throws NoSuchAlgorithmException;
}
