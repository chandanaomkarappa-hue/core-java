class LaptopBagExecutor {
    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("The LaptopBag Brand is: " + LaptopBag.getBrand());
        System.out.println("----------------------------");

        System.out.println("The LaptopBag Price is: " + LaptopBag.getPrice());
        System.out.println("----------------------------");

        System.out.println("The LaptopBag Color is: " + LaptopBag.getColor());
        System.out.println("----------------------------");

        System.out.println("Is it Water Resistant? " + LaptopBag.isWaterResistant());
        System.out.println("----------------------------");

        System.out.println("The LaptopBag Capacity is: " + LaptopBag.getCapacity() + " liters");
        System.out.println("----------------------------");

        System.out.println("main ended");
        return;
    }
}