class SleepBed
{
    static String brand;
    static String size;
    static String productDimension;
    static int itemWeight;
    static String itemFirmnessDescription;
    static String topStyle;

    public static void main(String args[])
    {
         String brand = "Sleepwell";
		 String size = "King";
        String productDimension = "198.1l * 182.9w";
         int itemWeight = 24;
        String  itemFirmnessDescription = "Medium Firm";
         String topStyle = "Tight Top";

        System.out.println("The brand is: " + brand);
		System.out.println("The brand is: " + SleepBed.brand);
		
        System.out.println("The size is: " + size);
		System.out.println("The size is: " + SleepBed.size);
	
        System.out.println("The productDimension is: " + productDimension);
		System.out.println("The productDimension is: " + SleepBed.productDimension);
		
        System.out.println("The itemWeight is: " + itemWeight);
		System.out.println("The itemWeight is: " + SleepBed.itemWeight);
		
        System.out.println("The itemFirmnessDescription is: " + itemFirmnessDescription);
		System.out.println("The itemFirmnessDescription is: " + SleepBed.itemFirmnessDescription);
		
        System.out.println("The topStyle is: " + topStyle);
		System.out.println("The topStyle is: " + SleepBed.topStyle);
    }
}
