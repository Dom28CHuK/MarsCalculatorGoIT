package project;

public class MarsValueConverter {

    public int changeMoneyAmount(float startAmount, float toRemove) {
        return (int) (startAmount - toRemove);
    }

    public byte calculateMoneySum(int sum1, int sum2) {
        return (byte) (sum1 + sum2);
    }

    public short halfOfMoney(double startMoney) {
        return (short) (startMoney / 2);
    }

    public static void main(String[] args) {
        MarsValueConverter marsValueConverter = new MarsValueConverter();

        System.out.println(marsValueConverter.changeMoneyAmount(100f, 40.5f)); //59
        System.out.println(marsValueConverter.calculateMoneySum(50, 40)); //90
        System.out.println(marsValueConverter.halfOfMoney(1000.9999)); //500
    }
}
