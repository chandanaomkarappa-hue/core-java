class PowerMax
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Ambrane");
      return "Ambrane";
   }

   public static double getPrice()
   {
      System.out.println("getPrice() invoked");
      System.out.println(1499.99);
      return 1499.99;
   }

   public static String getCapacity()
   {
      System.out.println("getCapacity() invoked");
      System.out.println("20000mAh");
      return "20000mAh";
   }

   public static String getOutputPorts()
   {
      System.out.println("getOutputPorts() invoked");
      System.out.println("2 USB + 1 Type-C");
      return "2 USB + 1 Type-C";
   }

   public static String getFastChargingSupport()
   {
      System.out.println("getFastChargingSupport() invoked");
      System.out.println("Yes, Quick Charge 3.0");
      return "Yes, Quick Charge 3.0";
   }
}