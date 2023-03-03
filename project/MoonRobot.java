package project;

public class MoonRobot {
    public boolean canOvercomeHole(int holeDepth, int batteryPercent) {
        return holeDepth < 34 || batteryPercent > 67;
    }

    public boolean canJumpOverHill(int hillHeight, int batteryPercent) {
        return hillHeight <= 150 && batteryPercent >= 90;
    }
    public boolean areSensorsOk(boolean isEngineWorking, boolean isRobotStanding) {
        return isEngineWorking ^ isRobotStanding;
    }

    public boolean shouldSleep(boolean isDayNow) {
        return isDayNow == false;
    }

    //Test output
    public static void main(String[] args) {
        MoonRobot robot = new MoonRobot();

        System.out.println("shouldSleep(true) = " + robot.shouldSleep(true));
        System.out.println("shouldSleep(false) = " + robot.shouldSleep(false));
    }
}

