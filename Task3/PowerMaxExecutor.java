class PowerMaxExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("The Power Bank Brand is : " + PowerMax.getBrand());
      System.out.println("--------------------------------");

      System.out.println("The Power Bank Price is : " + PowerMax.getPrice());
      System.out.println("--------------------------------");

      System.out.println("The Power Bank Capacity is : " + PowerMax.getCapacity());
      System.out.println("--------------------------------");

      System.out.println("The Power Bank Output Ports are : " + PowerMax.getOutputPorts());
      System.out.println("--------------------------------");

      System.out.println("The Power Bank Fast Charging Support is : " + PowerMax.getFastChargingSupport());
      System.out.println("--------------------------------");

      System.out.println("main ended");
      return;
   }
}