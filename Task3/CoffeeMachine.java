class CoffeeMachine{

    public static String getMachineName() {
        System.out.println("getMachineName() invoked");
        System.out.println("BrewMaster 3000");
        return "BrewMaster 3000";
    }

    public static double getMachinePrice() {
        System.out.println("getMachinePrice() invoked");
        System.out.println(14999.50);
        return 14999.50;
    }

    public static int getWaterTankCapacity() {
        System.out.println("getWaterTankCapacity() invoked");
        System.out.println(2);
        return 2; // liters
    }

    public static boolean supportsAutoBrew() {
        System.out.println("supportsAutoBrew() invoked");
        System.out.println(true);
        return true;
    }

    public static int getCoffeeStrengthLevels() {
        System.out.println("getCoffeeStrengthLevels() invoked");
        System.out.println(5);
        return 5;
    }

    public static boolean hasMilkFrother() {
        System.out.println("hasMilkFrother() invoked");
        System.out.println(true);
        return true;
    }
}

