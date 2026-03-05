class GamePulseExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("The Gaming Mouse Brand is : " + GamePulse.getBrand());
      System.out.println("--------------------------------");

      System.out.println("The Gaming Mouse Price is : " + GamePulse.getPrice());
      System.out.println("--------------------------------");

      System.out.println("The Gaming Mouse DPI is : " + GamePulse.getDPI());
      System.out.println("--------------------------------");

      System.out.println("The Gaming Mouse Buttons are : " + GamePulse.getButtons());
      System.out.println("--------------------------------");

      System.out.println("The Gaming Mouse Connectivity is : " + GamePulse.getConnectivity());
      System.out.println("--------------------------------");

      System.out.println("main ended");
      return;
   }
}