class Library
{
	
    static String BookNames[]={"Java Programming","Data Structures","Operating Systems","Computer Networks"};
	
	public static void getBookNames()
	{
	System.out.println("getBookNames invoked");
	  for(String BookName:BookNames)
	  {
	  System.out.println(BookName);
	  }
	  System.out.println("end of getBookNames");
	  }
}