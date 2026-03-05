class YouCan
{
    static String publisher;
    static String publisherDate;
    static String language;
    static int printLength;
    static long isBn10;
    static String isBn13;
    static String readingAge;
    static float itemWeight;
    static String countryOfOrigin;
    static int netQuantity;

    public static void main(String args[])
    {
        publisher = "null";
        publisherDate = "06 August 2020";
        language = "English";
        printLength = 232;
        isBn10 = 9876554L;
        isBn13 = "98-87654321";
        readingAge = "customer suggested age:16 years and up";
        itemWeight = 300f;
        countryOfOrigin = "India";
        netQuantity = 1;

        System.out.println("The publisher is: " + publisher);
        System.out.println("The publisherDate is: " + publisherDate);
        System.out.println("The language is: " + language);
        System.out.println("The printLength is: " + printLength);
        System.out.println("The isBn10 is: " + isBn10);
        System.out.println("The isBn13 is: " + isBn13);
        System.out.println("The readingAge is: " + readingAge);
        System.out.println("The itemWeight is: " + itemWeight);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
        System.out.println("The netQuantity is: " + netQuantity);
    }
}
