class CuetPg
{
    static String asin = "BODJ1WMNBQ";
    static String publicationDate = "14-10-2024";
    static String accessibility = "Learn More";
    static String language = "English";
    static int fileSize = 6;
    static String xRay = "Enabled";

    public static void main(String args[])
    {
        String asin = "BODJ1WMNCX";
        String publicationDate = "01-01-2025";
        String accessibility = "Full Access";
        String language = "English & Spanish";
        int fileSize = 8;
        String xRay = "Disabled";

        System.out.println("ASIN number: " + asin);
        System.out.println("ASIN number (static): " + CuetPg.asin);

        System.out.println("Published on: " + publicationDate);
        System.out.println("Published on (static): " + CuetPg.publicationDate);

        System.out.println("Accessibility option: " + accessibility);
        System.out.println("Accessibility option (static): " + CuetPg.accessibility);

        System.out.println("Available language: " + language);
        System.out.println("Available language (static): " + CuetPg.language);

        System.out.println("File size (MB): " + fileSize);
        System.out.println("File size (MB, static): " + CuetPg.fileSize);

        System.out.println("X-Ray feature: " + xRay);
        System.out.println("X-Ray feature (static): " + CuetPg.xRay);
    }
}
