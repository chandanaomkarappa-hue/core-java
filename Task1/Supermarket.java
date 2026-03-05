class Supermarket
{

    static String ItemNames[]={"Rice","Milk","Bread","Sugar"};

    public static void getItemNames()
    {
    System.out.println("getItemNames invoked");
      for(String ItemName:ItemNames)
      {
      System.out.println(ItemName);
      }
      System.out.println("end of getItemNames");
    }
}