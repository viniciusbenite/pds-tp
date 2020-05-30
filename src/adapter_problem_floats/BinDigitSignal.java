package adapter_problem_floats;

import java.util.Arrays;

public class BinDigitSignal implements DigitSignal {
    private byte[] data;

    public BinDigitSignal(byte[] data) {
        this.data = data;
    }

    @Override
    public byte[] getDigit() {
        return data;
    }

    @Override
    public void setDigit(byte[] digitData) {
        this.data = digitData;
    }

    @Override
    public void printDigit() {
        System.out.printf("Binary array: %s\n", Arrays.toString(getDigit()));
    }
}
