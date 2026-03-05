class AuthorProfile
{
    static String authorName;
    static String bookName;
    static String genre;
    static int publishedYear;
    static String nationality;
    static boolean alive;

    public static void main(String[] args)
    {
        authorName = "A.P.J. Abdul Kalam";
        bookName = "Wings of Fire";
        genre = "Autobiography";
        publishedYear = 1999;
        nationality = "Indian";
        alive = false;

        System.out.println("The authorName is: " + authorName);
        System.out.println("The bookName is: " + bookName);
        System.out.println("The genre is: " + genre);
        System.out.println("The publishedYear is: " + publishedYear);
        System.out.println("The nationality is: " + nationality);
        System.out.println("The alive is: " + alive);
    }
}
