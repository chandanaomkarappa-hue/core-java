class CoffeeMakerExecutor{

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Coffee Maker Model: " + CoffeeMaker.getCoffeeMakerModel());
        System.out.println("----------------------------");

        System.out.println("Coffee Maker Price: " + CoffeeMaker.getCoffeeMakerPrice());
        System.out.println("----------------------------");

        System.out.println("Auto Brew Supported: " + CoffeeMaker.supportsAutoBrew());
        System.out.println("----------------------------");

        System.out.println("Milk Frother Available: " + CoffeeMaker.hasMilkFrother());
        System.out.println("----------------------------");

        System.out.println("Water Tank Capacity: " + CoffeeMaker.getWaterTankCapacity() + " Liters");
        System.out.println("----------------------------");

        System.out.println("Auto Shut Off Available: " + CoffeeMaker.hasAutoShutOff());
        System.out.println("----------------------------");

        System.out.println("main ended");
    }
}