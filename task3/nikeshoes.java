class NikeShoes
{
    static String productName;
    static String brand;
    static String gender;
    static int size;
    static String color;
    static String material;
    static boolean lightweight;
    static long price;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Running Shoes";
        brand = "Nike";
        gender = "Unisex";
        size = 9;
        color = "Black";
        material = "Mesh";
        lightweight = true;
        price = 4999L;
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The gender is: " + gender);
        System.out.println("The size is: " + size);
        System.out.println("The color is: " + color);
        System.out.println("The material is: " + material);
        System.out.println("The lightweight is: " + lightweight);
        System.out.println("The price is: " + price);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
