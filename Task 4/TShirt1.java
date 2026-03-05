class TShirt1
{
    static String productName = "Basic T-Shirt";
    static String brand = "H&M";
    static String size = "M";
    static String color = "Black";
    static String material = "Cotton";
    static boolean isSlimFit = true;
    static long price = 799;
    static int warrantyMonths = 0;
    static String manufacturingDate = "01-03-2026";

    public static void main(String[] args)
    {
        String productName = "Graphic T-Shirt";
        String brand = "H&M";
        String size = "L";
        String color = "White";
        String material = "Polyester";
        boolean isSlimFit = false;
        long price = 999;
        int warrantyMonths = 0;
        String manufacturingDate = "15-03-2026";
		
        System.out.println("Product Name: " + productName);
        System.out.println("Product Name (static): " + TShirt1.productName);

        System.out.println("Brand: " + brand);
        System.out.println("Brand (static): " + TShirt1.brand);

        System.out.println("Size: " + size);
        System.out.println("Size (static): " + TShirt1.size);

        System.out.println("Color: " + color);
        System.out.println("Color (static): " + TShirt1.color);

        System.out.println("Material: " + material);
        System.out.println("Material (static): " + TShirt1.material);

        System.out.println("Is Slim Fit: " + isSlimFit);
        System.out.println("Is Slim Fit (static): " + TShirt1.isSlimFit);

        System.out.println("Price: " + price);
        System.out.println("Price (static): " + TShirt1.price);

        System.out.println("Warranty (Months): " + warrantyMonths);
        System.out.println("Warranty (Months, static): " + TShirt1.warrantyMonths);

        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Manufacturing Date (static): " + TShirt1.manufacturingDate);
    }
}
