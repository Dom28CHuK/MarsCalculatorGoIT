package project;

public class MoonRobot {
    public boolean canOvercomeHole(int holeDepth, int batteryPercent) {
        return holeDepth < 34 || batteryPercent > 67;
    }

    public boolean canJumpOverHill(int hillHeight, int batteryPercent) {
        return hillHeight <= 150 && batteryPercent >= 90;
    }
    public boolean areSensorsOk(boolean isEngineWorking, boolean isRobotStanding) {
        return (isEngineWorking == true & isRobotStanding == false) ^
                (isEngineWorking == false & isRobotStanding == true);
    }

    //Test output
    public static void main(String[] args) {
        MoonRobot robot = new MoonRobot();

        //Should be false
        System.out.println("canOvercomeHole(50, 60) = " + robot.canOvercomeHole(50, 60));
        System.out.println("canOvercomeHole(100, 80) = " + robot.canOvercomeHole(100, 80));

        System.out.println("canOvercomeHole(100, 90) = " + robot.canOvercomeHole(100, 90));
        System.out.println("canJumpOverHill(180, 100) = " + robot.canJumpOverHill(180, 100));

        System.out.println("areSensorsOk(true, true) = " + robot.areSensorsOk(true, true));
        System.out.println("areSensorsOk(false, true) = " + robot.areSensorsOk(false, true));
    }
}
