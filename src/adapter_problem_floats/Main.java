package adapter_problem_floats;

public class Main {

    public static void main(String[] args) {

        float[] analogData = { 0.2f, 1.4f, 3.12f, 0.9f, 10f, 1.1f };
        byte[] binData = { 0, 1, 1, 0 };
        float[] analogData2 = { 1.2f, 1.4f, 0.12f, 0.9f };

        AnalogSignal analogSignal = new FloatAnalogSignal(analogData);
        analogSignal.printAnalog();

        DigitSignal digitSignal = new BinDigitSignal(binData);
        digitSignal.printDigit();

        // adapter
        AnalogToDigitAdapter adAdapter = new AnalogToDigitAdapter(analogSignal);
        adAdapter.printDigit();

        adAdapter.setAnalogData(analogData2);
        adAdapter.printDigit();
    }
}
