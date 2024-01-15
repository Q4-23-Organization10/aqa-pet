package hw9task2;

public class ProgrammingCalculator extends Calculator{

    public int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
