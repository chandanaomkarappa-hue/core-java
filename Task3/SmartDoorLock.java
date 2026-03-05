class SmartDoorLock{

    public static String getLockModel() {
        System.out.println("getLockModel() invoked");
        System.out.println("SecureLock X Pro");
        return "SecureLock X Pro";
    }

    public static double getLockPrice() {
        System.out.println("getLockPrice() invoked");
        System.out.println(18999.99);
        return 18999.99;
    }

    public static boolean supportsFingerprint() {
        System.out.println("supportsFingerprint() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean supportsMobileApp() {
        System.out.println("supportsMobileApp() invoked");
        System.out.println(true);
        return true;
    }

    public static int getMaxUserAccess() {
        System.out.println("getMaxUserAccess() invoked");
        System.out.println(100);
        return 100; // number of users
    }

    public static boolean hasAlarmSystem() {
        System.out.println("hasAlarmSystem() invoked");
        System.out.println(true);
        return true;
    }
}

