class SmartRefrigeratorExecutor {
    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("The SmartRefrigerator Brand is: " + SmartRefrigerator.getBrand());
        System.out.println("----------------------------");

        System.out.println("The SmartRefrigerator Price is: " + SmartRefrigerator.getPrice());
        System.out.println("----------------------------");

        System.out.println("The SmartRefrigerator Color is: " + SmartRefrigerator.getColor());
        System.out.println("----------------------------");

        System.out.println("Does it have Smart Features? " + SmartRefrigerator.hasSmartFeatures());
        System.out.println("----------------------------");

        System.out.println("The SmartRefrigerator Capacity is: " + SmartRefrigerator.getCapacity() + " liters");
        System.out.println("----------------------------");

        System.out.println("main ended");
        return;
    }
}