class OttNetFlixSeries {

    public static void main(String[] args) {

        String platformName = "Netflix Web Series";

        String StrangerThings = "Stranger Things";
        String MoneyHeist = "Money Heist";
        String Dark = "Dark";
        String TheWitcher = "The Witcher";
        String Wednesday = "Wednesday";
        String SacredGames = "Sacred Games";
        String DelhiCrime = "Delhi Crime";
        String Mirzapur = "Mirzapur";
        String TheFamilyMan = "The Family Man";
        String BreakingBad = "Breaking Bad";
        String SquidGame = "Squid Game";
        String Narcos = "Narcos";
        String PeakyBlinders = "Peaky Blinders";
        String Lucifer = "Lucifer";
        String TheCrown = "The Crown";
        String Ozark = "Ozark";
        String ThirteenReasonsWhy = "13 Reasons Why";
        String TheUmbrellaAcademy = "The Umbrella Academy";
        String BlackMirror = "Black Mirror";
        String You = "You";
        String SexEducation = "Sex Education";
        String TheBoys = "The Boys";
        String HouseOfTheDragon = "House of the Dragon";
        String GameOfThrones = "Game of Thrones";
        String TheNightManager = "The Night Manager";
        String Farzi = "Farzi";
        String Panchayat = "Panchayat";
        String Asur = "Asur";
        String Scam1992 = "Scam 1992";
        String SpecialOps = "Special Ops";

        String webseries[] = {
            StrangerThings, MoneyHeist, Dark, TheWitcher, Wednesday, SacredGames,
            DelhiCrime, Mirzapur, TheFamilyMan, BreakingBad, SquidGame, Narcos,
            PeakyBlinders, Lucifer, TheCrown, Ozark, ThirteenReasonsWhy,
            TheUmbrellaAcademy, BlackMirror, You, SexEducation, TheBoys,
            HouseOfTheDragon, GameOfThrones, TheNightManager, Farzi,
            Panchayat, Asur, Scam1992, SpecialOps
        };

        System.out.println("Platform Name: " + platformName);
        System.out.println("Web Series List:");

        for (String series : webseries) {
            System.out.println(series);
        }
    }
}
