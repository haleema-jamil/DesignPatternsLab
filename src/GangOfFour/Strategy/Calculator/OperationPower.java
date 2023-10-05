package GangOfFour.Strategy.Calculator;

public class OperationPower implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        int result = (int) Math.pow(num1, num2);

        return result;
    }
}
