class SmartWatch
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Fire-Boltt");
      return "Fire-Boltt";
   }

   public static double getPrice()
   {
      System.out.println("getPrice() invoked");
      System.out.println(2999.99);
      return 2999.99;
   }

   public static String getDisplayType()
   {
      System.out.println("getDisplayType() invoked");
      System.out.println("AMOLED Display");
      return "AMOLED Display";
   }

   public static String getBatteryLife()
   {
      System.out.println("getBatteryLife() invoked");
      System.out.println("7 Days Battery");
      return "7 Days Battery";
   }

   public static String getConnectivity()
   {
      System.out.println("getConnectivity() invoked");
      System.out.println("Bluetooth Calling");
      return "Bluetooth Calling";
   }
}