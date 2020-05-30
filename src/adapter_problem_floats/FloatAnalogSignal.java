package adapter_problem_floats;

import java.util.Arrays;

public class FloatAnalogSignal implements AnalogSignal {

    private float[] data;

    public FloatAnalogSignal(float[] data) {
        this.data = data;
    }

    @Override
    public float[] getAnalog() {
        return data;
    }

    @Override
    public void setAnalog(float[] analogData) {
        this.data = analogData;
    }

    @Override
    public void printAnalog() {
        System.out.printf("Analog array: %s\n", Arrays.toString(getAnalog()));
    }
}
