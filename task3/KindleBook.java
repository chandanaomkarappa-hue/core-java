class KindleBook
{
    static String asIn;
    static String publisher;
    static String publisherDate;
    static int fileSize;
    static String screenReader;
    static String wordWise;
    static String book;
    static String accessibility;

    public static void main(String args[])
    {
        asIn = "BO19PIOJYU";
        publisher = "Pottermore Publishing";
        publisherDate = "8 December 2015";
        fileSize = 4;
        screenReader = "Supported";
        wordWise = "Enabled";
        book = "Harry Potter";
        accessibility = "Learn";

        System.out.println("The asIn is: " + asIn);
        System.out.println("The publisher is: " + publisher);
        System.out.println("The publisherDate is: " + publisherDate);
        System.out.println("The fileSize is: " + fileSize);
        System.out.println("The screenReader is: " + screenReader);
        System.out.println("The wordWise is: " + wordWise);
        System.out.println("The book is: " + book);
        System.out.println("The accessibility is: " + accessibility);
    }
}
