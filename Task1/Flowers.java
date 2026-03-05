class Flowers{
	
    static String FlowerNames[]={"Rose","Lily","Lotus","Sunflower"};
	
	public static void getFlowerNames()
	{
	System.out.println("getFlowerNames invoked");
	  for(String FlowerName:FlowerNames)
	  {
	  System.out.println(FlowerName);
	  }
	  System.out.println("end of getFlowerNames");
	  }
}