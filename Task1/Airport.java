class Airport
{

    static String AirportNames[]={"Kempegowda Airport","Indira Gandhi Airport","Chhatrapati Shivaji Airport","Rajiv Gandhi Airport"};

    public static void getAirportNames()
    {
    System.out.println("getAirportNames invoked");
      for(String AirportName:AirportNames)
      {
      System.out.println(AirportName);
      }
      System.out.println("end of getAirportNames");
    }
}