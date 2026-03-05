class AuthorProfile
{
    static String authorName = "J.K. Rowling";
    static String bookName = "Harry Potter and the Philosopher's Stone";
    static String genre = "Fantasy";
    static int publishedYear = 1997;
    static String nationality = "British";
    static boolean alive = true;

    public static void main(String[] args)
    {
        String authorName = "A.P.J. Abdul Kalam";
        String bookName = "Wings of Fire";
        String genre = "Autobiography";
        int publishedYear = 1999;
        String nationality = "Indian";
        boolean alive = false;

        System.out.println("The authorName is: " + authorName);
        System.out.println("The authorName is: " + AuthorProfile.authorName);

        System.out.println("The bookName is: " + bookName);
        System.out.println("The bookName is: " + AuthorProfile.bookName);

        System.out.println("The genre is: " + genre);
        System.out.println("The genre is: " + AuthorProfile.genre);

        System.out.println("The publishedYear is: " + publishedYear);
        System.out.println("The publishedYear is: " + AuthorProfile.publishedYear);

        System.out.println("The nationality is: " + nationality);
        System.out.println("The nationality is: " + AuthorProfile.nationality);

        System.out.println("The alive is: " + alive);
        System.out.println("The alive is: " + AuthorProfile.alive);
    }
}
