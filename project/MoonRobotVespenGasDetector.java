package project;

public class MoonRobotVespenGasDetector {
    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid) {
        return acidValue >= minAcid && acidValue <= maxAcid;
    }

    public boolean isDensityOk(int density) {
        return (density >= 1000 && density <= 5000) ^
                (density >= 10000 && density <= 15000);
    }

    public boolean isTemperatureOk(boolean cold) {
        return cold != true;
    }

    public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold) {
        return isAcidOk(acidValue, minAcid, maxAcid) == true && isDensityOk(density) == true && isTemperatureOk(cold) == true;
    }

    public static void main(String[] args) {
        MoonRobotVespenGasDetector vespen = new MoonRobotVespenGasDetector();

        System.out.println(vespen.isAcidOk(100, 50, 150)); //true
        System.out.println(vespen.isDensityOk(1500)); //true
        System.out.println(vespen.isDensityOk(30000)); //false
        System.out.println(vespen.isTemperatureOk(false)); //true
        System.out.println(vespen.isGroundOkForVespenGas(120, 75, 150, 7500, false)); // true
    }
}
