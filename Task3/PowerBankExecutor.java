class PowerBankExecutor {
    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("The PowerBank Brand is: " + PowerBank.getBrand());
        System.out.println("----------------------------");

        System.out.println("The PowerBank Price is: " + PowerBank.getPrice());
        System.out.println("----------------------------");

        System.out.println("The PowerBank Color is: " + PowerBank.getColor());
        System.out.println("----------------------------");

        System.out.println("Is Fast Charging Supported? " + PowerBank.isFastCharging());
        System.out.println("----------------------------");

        System.out.println("The PowerBank Capacity is: " + PowerBank.getCapacity() + " mAh");
        System.out.println("----------------------------");

        System.out.println("main ended");
        return;
    }
}