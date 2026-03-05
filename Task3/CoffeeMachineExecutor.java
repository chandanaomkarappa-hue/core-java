class CoffeeMachineExecutor{

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Machine Name: " + CoffeeMachine.getMachineName());
        System.out.println("----------------------------");

        System.out.println("Machine Price: " + CoffeeMachine.getMachinePrice());
        System.out.println("----------------------------");

        System.out.println("Water Tank Capacity: " + CoffeeMachine.getWaterTankCapacity() + " liters");
        System.out.println("----------------------------");

        System.out.println("Auto Brew Supported: " + CoffeeMachine.supportsAutoBrew());
        System.out.println("----------------------------");

        System.out.println("Coffee Strength Levels: " + CoffeeMachine.getCoffeeStrengthLevels());
        System.out.println("----------------------------");

        System.out.println("Milk Frother Available: " + CoffeeMachine.hasMilkFrother());
        System.out.println("----------------------------");

        System.out.println("main ended");
    }
}