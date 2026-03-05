class ElectricBike{

    public static String getBikeModel() {
        System.out.println("getBikeModel() invoked");
        System.out.println("VoltRide X1");
        return "VoltRide X1";
    }

    public static double getBikePrice() {
        System.out.println("getBikePrice() invoked");
        System.out.println(95000.75);
        return 95000.75;
    }

    public static int getBatteryCapacity() {
        System.out.println("getBatteryCapacity() invoked");
        System.out.println(48);
        return 48; // volts
    }

    public static boolean hasFastCharging() {
        System.out.println("hasFastCharging() invoked");
        System.out.println(true);
        return true;
    }

    public static int getMaxSpeed() {
        System.out.println("getMaxSpeed() invoked");
        System.out.println(45);
        return 45; // km/h
    }

    public static int getRangePerCharge() {
        System.out.println("getRangePerCharge() invoked");
        System.out.println(120);
        return 120; // kilometers
    }
}

