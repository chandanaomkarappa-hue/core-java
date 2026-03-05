class AeroBook
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("HP");
      return "HP";
   }

   public static double getPrice()
   {
      System.out.println("getPrice() invoked");
      System.out.println(55999.75);
      return 55999.75;
   }

   public static String getProcessor()
   {
      System.out.println("getProcessor() invoked");
      System.out.println("Intel Core i7 12th Gen");
      return "Intel Core i7 12th Gen";
   }

   public static String getRAM()
   {
      System.out.println("getRAM() invoked");
      System.out.println("16GB DDR4");
      return "16GB DDR4";
   }

   public static String getStorage()
   {
      System.out.println("getStorage() invoked");
      System.out.println("512GB SSD");
      return "512GB SSD";
   }
}