class CoffeeMaker{

    public static String getCoffeeMakerModel() {
        System.out.println("getCoffeeMakerModel() invoked");
        System.out.println("BrewMaster C5");
        return "BrewMaster C5";
    }

    public static double getCoffeeMakerPrice() {
        System.out.println("getCoffeeMakerPrice() invoked");
        System.out.println(7999.50);
        return 7999.50;
    }

    public static boolean supportsAutoBrew() {
        System.out.println("supportsAutoBrew() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean hasMilkFrother() {
        System.out.println("hasMilkFrother() invoked");
        System.out.println(true);
        return true;
    }

    public static int getWaterTankCapacity() {
        System.out.println("getWaterTankCapacity() invoked");
        System.out.println(2);
        return 2; // Liters
    }

    public static boolean hasAutoShutOff() {
        System.out.println("hasAutoShutOff() invoked");
        System.out.println(true);
        return true;
    }
}

