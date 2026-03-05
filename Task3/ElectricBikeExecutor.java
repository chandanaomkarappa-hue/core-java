class ElectricBikeExecutor{

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Bike Model: " + ElectricBike.getBikeModel());
        System.out.println("---------------------------");

        System.out.println("Bike Price: " + ElectricBike.getBikePrice());
        System.out.println("---------------------------");

        System.out.println("Battery Capacity: " + ElectricBike.getBatteryCapacity() + " V");
        System.out.println("---------------------------");

        System.out.println("Fast Charging Available: " + ElectricBike.hasFastCharging());
        System.out.println("---------------------------");

        System.out.println("Maximum Speed: " + ElectricBike.getMaxSpeed() + " km/h");
        System.out.println("---------------------------");

        System.out.println("Range Per Charge: " + ElectricBike.getRangePerCharge() + " km");
        System.out.println("---------------------------");

        System.out.println("main ended");
    }
}