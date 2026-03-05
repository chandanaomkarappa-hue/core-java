class RobotVacuumExecutor {

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Vacuum Model: " + RobotVacuum.getVacuumModel());
        System.out.println("----------------------------");

        System.out.println("Vacuum Price: " + RobotVacuum.getVacuumPrice());
        System.out.println("----------------------------");

        System.out.println("Battery Life: " + RobotVacuum.getBatteryLife() + " minutes");
        System.out.println("----------------------------");

        System.out.println("Auto Cleaning Supported: " + RobotVacuum.supportsAutoCleaning());
        System.out.println("----------------------------");

        System.out.println("Dust Capacity: " + RobotVacuum.getDustCapacity() + " ml");
        System.out.println("----------------------------");

        System.out.println("Smart Navigation Available: " + RobotVacuum.hasSmartNavigation());
        System.out.println("----------------------------");

        System.out.println("main ended");
    }
}