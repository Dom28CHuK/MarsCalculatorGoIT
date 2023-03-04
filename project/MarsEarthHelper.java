package project;

public class MarsEarthHelper {
    public int convertAppleCount(float count) {
        return (int) count;
    }

    public byte countAppleCount(int garden1Count, int garden2Count) {
        return (byte) (garden1Count + garden2Count);
    }
    public static void main(String[] args) {
        MarsEarthHelper helper = new MarsEarthHelper();

        //Should be 10
        System.out.println("convertAppleCount(10f) = " + helper.convertAppleCount(11.5f));
        //Should be 17
        System.out.println("countAppleCount(10, 7) = " + helper.countAppleCount(10, 7));

        System.out.println("countAppleCount(10, 30) = " + helper.countAppleCount(10, 30));
        System.out.println("countAppleCount(50, 1) = " + helper.countAppleCount(50, 1));
    }
}
