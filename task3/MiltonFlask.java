class MiltonFlask
{
    static String productName;
    static String brand;
    static String color;
    static String material;
    static int capacityML;
    static boolean leakProof;
    static long price;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Thermosteel Flask";
        brand = "Milton";
        color = "Silver";
        material = "Stainless Steel";
        capacityML = 1000;
        leakProof = true;
        price = 899L;
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The color is: " + color);
        System.out.println("The material is: " + material);
        System.out.println("The capacityML is: " + capacityML);
        System.out.println("The leakProof is: " + leakProof);
        System.out.println("The price is: " + price);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
