class SonicWaveExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("The Speaker Brand is : " + SonicWave.getBrand());
      System.out.println("--------------------------------");

      System.out.println("The Speaker Price is : " + SonicWave.getPrice());
      System.out.println("--------------------------------");

      System.out.println("The Speaker Sound Output is : " + SonicWave.getSoundOutput());
      System.out.println("--------------------------------");

      System.out.println("The Speaker Battery Backup is : " + SonicWave.getBatteryBackup());
      System.out.println("--------------------------------");

      System.out.println("The Speaker Water Resistance is : " + SonicWave.getWaterResistance());
      System.out.println("--------------------------------");

      System.out.println("main ended");
      return;
   }
}