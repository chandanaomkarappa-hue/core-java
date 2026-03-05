class SmartWatchExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("The SmartWatch Brand is : " + SmartWatch.getBrand());
      System.out.println("--------------------------------");

      System.out.println("The SmartWatch Price is : " + SmartWatch.getPrice());
      System.out.println("--------------------------------");

      System.out.println("The SmartWatch Display is : " + SmartWatch.getDisplayType());
      System.out.println("--------------------------------");

      System.out.println("The SmartWatch Battery Life is : " + SmartWatch.getBatteryLife());
      System.out.println("--------------------------------");

      System.out.println("The SmartWatch Connectivity is : " + SmartWatch.getConnectivity());
      System.out.println("--------------------------------");

      System.out.println("main ended");
      return;
   }
}