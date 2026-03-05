class ElectricKettleExecutor {

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Kettle Model: " + ElectricKettle.getKettleModel());
        System.out.println("----------------------------");

        System.out.println("Kettle Price: " + ElectricKettle.getKettlePrice());
        System.out.println("----------------------------");

        System.out.println("Auto Shut Off Available: " + ElectricKettle.hasAutoShutOff());
        System.out.println("----------------------------");

        System.out.println("Temperature Control Available: " + ElectricKettle.hasTemperatureControl());
        System.out.println("----------------------------");

        System.out.println("Capacity: " + ElectricKettle.getCapacity() + " Liters");
        System.out.println("----------------------------");

        System.out.println("Boil Dry Protection: " + ElectricKettle.hasBoilDryProtection());
        System.out.println("----------------------------");

        System.out.println("main ended");
    }
}