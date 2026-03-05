class WashingMachineExecutor {
    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("The WashingMachine Brand is: " + WashingMachine.getBrand());
        System.out.println("----------------------------");

        System.out.println("The WashingMachine Price is: " + WashingMachine.getPrice());
        System.out.println("----------------------------");

        System.out.println("The WashingMachine Color is: " + WashingMachine.getColor());
        System.out.println("----------------------------");

        System.out.println("Is it Fully Automatic? " + WashingMachine.isFullyAutomatic());
        System.out.println("----------------------------");

        System.out.println("The WashingMachine Capacity is: " + WashingMachine.getCapacity() + " kg");
        System.out.println("----------------------------");

        System.out.println("main ended");
        return;
    }
}