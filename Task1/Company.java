class Company
{
	
    static String CompanyNames[]={"TCS","Infosys","Wipro","Accenture"};
	
	public static void getCompanyNames()
	{
	System.out.println("getCompanyNames invoked");
	  for(String CompanyName:CompanyNames)
	  {
	  System.out.println(CompanyName);
	  }
	  System.out.println("end of getCompanyNames");
	  }
}