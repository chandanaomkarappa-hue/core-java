class CuetPg
{
    static String asin;
    static String publicationDate;
    static String accessibility;
    static String language;
    static int fileSize;
    static String xRay;

    public static void main(String args[])
    {
        asin = "BODJ1WMNBQ";
        publicationDate = "14-10-2024";
        accessibility = "Learn More";
        language = "English";
        fileSize = 6;
        xRay = "Enabled";

        System.out.println("ASIN number: " + asin);
        System.out.println("Published on: " + publicationDate);
        System.out.println("Accessibility option: " + accessibility);
        System.out.println("Available language: " + language);
        System.out.println("File size (MB): " + fileSize);
        System.out.println("X-Ray feature: " + xRay);
    }
}
