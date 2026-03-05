class SinBinDetails
{
    static String publicationName;
    static String releaseDate;
    static String bookLanguage;
    static int totalPages;
    static String ageRecommendation;
    static float weightInGrams;
    static String madeIn;
    static int quantity;
    static String digitalFlip;

    public static void main(String args[])
    {
        publicationName = "Fingerpublishing";
        releaseDate = "08 December 2025";
        bookLanguage = "English";
        totalPages = 472;
        ageRecommendation = "16 years and above";
        weightInGrams = 300f;
        madeIn = "India";
        quantity = 1;
        digitalFlip = "Available";

        System.out.println("Publication Name: " + publicationName);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Book Language: " + bookLanguage);
        System.out.println("Total Pages: " + totalPages);
        System.out.println("Age Recommendation: " + ageRecommendation);
        System.out.println("Weight: " + weightInGrams);
        System.out.println("Country of Origin: " + madeIn);
        System.out.println("Quantity: " + quantity);
        System.out.println("Page Flip Option: " + digitalFlip);
    }
}
