class OttPlatformAmazonPrime
{
    public static void main(String[] args) 
    {
        String documentaries[] = {
            "Our Planet", "The Last Dance", "The Social Dilemma", "Inside Bill's Brain", "Seaspiracy",
            "13th", "Tiger King", "American Factory", "Night on Earth", "Making a Murderer",
            "Fyre Fraud", "The Playbook", "Abstract: The Art of Design", "Explained", "Dirty Money",
            "Inside Job", "Pandemic", "Cooked", "Chasing Coral", "Wild Wild Country",
            "Night Stalker", "The Chef Show", "Rotten", "Connected", "Babies",
            "High Score", "Cheer", "Pandemic: How to Prevent an Outbreak", "The Mind, Explained", "Frontline"
        };
        String kidsAnimation[] = {
            "Mickey Mouse Clubhouse", "Chhota Bheem", "Doraemon", "Peppa Pig", "Motu Patlu",
            "Pokemon", "PJ Masks", "Tom and Jerry", "Paw Patrol", "Shiva",
            "Big Hero 6", "Kung Fu Panda: Legends", "The Loud House", "Go Jetters", "Adventures of Little Krishna",
            "Mighty Little Bheem", "Oggy and the Cockroaches", "Miraculous Ladybug", "Cocomelon", "Chip & Potato",
            "Tayo the Little Bus", "Inspector Chingum", "Caillou", "Arthur", "My Little Pony",
            "The Magic School Bus", "Roll No 21", "Dragon Quest", "Super Bheem", "Looney Tunes"
        };

        String sports[] = {
            "Indian Premier League", "FIFA World Cup", "NBA Live", "Olympics Highlights", "WWE Raw",
            "Pro Kabaddi", "Formula 1 Live", "Tennis Grand Slam", "Hockey India League", "NFL Games",
            "Cricket World Cup", "Badminton World Tour", "Boxing Championship", "Golf Tournaments", "UEFA Champions League",
            "ISL Football", "Kabaddi Highlights", "MotoGP Live", "Cricket Analysis", "Soccer Highlights",
            "Athletics Championships", "Sports Talk Shows", "Live Score Updates", "ICC T20 World Cup", "NBA Highlights",
            "World Cup Qualifiers", "Copa America", "UEFA Euro", "Fast5 Netball", "Wimbledon Matches"
        };
        String series[] = {
            "Stranger Things", "Money Heist", "The Witcher", "Dark", "Breaking Bad",
            "The Family Man", "Sacred Games", "Narcos", "Peaky Blinders", "Lucifer",
            "The Umbrella Academy", "You", "13 Reasons Why", "Black Mirror", "Wednesday",
            "Ozark", "House of the Dragon", "Game of Thrones", "Farzi", "Panchayat",
            "Asur", "Scam 1992", "Special Ops", "Inside Edge", "Mirzapur",
            "Delhi Crime", "The Night Manager", "Shadow and Bone", "Squid Game", "The Crown"
        };
        String internationalMovies[] = {
            "Inception", "Interstellar", "The Dark Knight", "Avatar", "Titanic",
            "Avengers: Endgame", "The Matrix", "The Lion King", "Frozen", "Gladiator",
            "Spider-Man: No Way Home", "Black Panther", "Doctor Strange", "The Shawshank Redemption", "Forrest Gump",
            "Jurassic Park", "The Conjuring", "Joker", "Deadpool", "Thor: Ragnarok",
            "Mission: Impossible", "The Batman", "Dune", "No Time to Die", "The Hunger Games",
            "The Irishman", "The Kissing Booth", "To All the Boys I've Loved Before", "The Adam Project", "Enola Holmes"
        };

        String thrillersAction[] = {
            "Tenet", "Extraction", "Red Notice", "Army of the Dead", "Bright",
            "The Old Guard", "Triple Frontier", "6 Underground", "The Gray Man", "Project Power",
            "Rebel Moon", "Dune Part 2", "Extraction 2", "The Accountant", "Shooter",
            "Non-Stop", "Safe House", "Sicario", "Jason Bourne", "John Wick",
            "The Equalizer", "Deadpool 2", "The Kissing Booth 3", "Enola Holmes 2", "Moonfall",
            "Jurassic World", "Mission Impossible: Fallout", "Fast & Furious 9", "Black Widow", "Thor: Love and Thunder"
        };

  
        System.out.println("Documentaries & Originals:");
        System.out.println(documentaries[0] + "\n" + documentaries[1] + "\n" + documentaries[2] + "\n" + documentaries[3] + "\n" +
                           documentaries[4] + "\n" + documentaries[5] + "\n" + documentaries[6] + "\n" + documentaries[7] + "\n" +
                           documentaries[8] + "\n" + documentaries[9] + "\n" + documentaries[10] + "\n" + documentaries[11] + "\n" +
                           documentaries[12] + "\n" + documentaries[13] + "\n" + documentaries[14] + "\n" + documentaries[15] + "\n" +
                           documentaries[16] + "\n" + documentaries[17] + "\n" + documentaries[18] + "\n" + documentaries[19] + "\n" +
                           documentaries[20] + "\n" + documentaries[21] + "\n" + documentaries[22] + "\n" + documentaries[23] + "\n" +
                           documentaries[24] + "\n" + documentaries[25] + "\n" + documentaries[26] + "\n" + documentaries[27] + "\n" +
                           documentaries[28] + "\n" + documentaries[29]);

        System.out.println("\nKids & Animation:");
        System.out.println(kidsAnimation[0] + "\n" + kidsAnimation[1] + "\n" + kidsAnimation[2] + "\n" + kidsAnimation[3] + "\n" +
                           kidsAnimation[4] + "\n" + kidsAnimation[5] + "\n" + kidsAnimation[6] + "\n" + kidsAnimation[7] + "\n" +
                           kidsAnimation[8] + "\n" + kidsAnimation[9] + "\n" + kidsAnimation[10] + "\n" + kidsAnimation[11] + "\n" +
                           kidsAnimation[12] + "\n" + kidsAnimation[13] + "\n" + kidsAnimation[14] + "\n" + kidsAnimation[15] + "\n" +
                           kidsAnimation[16] + "\n" + kidsAnimation[17] + "\n" + kidsAnimation[18] + "\n" + kidsAnimation[19] + "\n" +
                           kidsAnimation[20] + "\n" + kidsAnimation[21] + "\n" + kidsAnimation[22] + "\n" + kidsAnimation[23] + "\n" +
                           kidsAnimation[24] + "\n" + kidsAnimation[25] + "\n" + kidsAnimation[26] + "\n" + kidsAnimation[27] + "\n" +
                           kidsAnimation[28] + "\n" + kidsAnimation[29]);

        System.out.println("\nSports:");
        System.out.println(sports[0] + "\n" + sports[1] + "\n" + sports[2] + "\n" + sports[3] + "\n" + sports[4] + "\n" +
                           sports[5] + "\n" + sports[6] + "\n" + sports[7] + "\n" + sports[8] + "\n" + sports[9] + "\n" +
                           sports[10] + "\n" + sports[11] + "\n" + sports[12] + "\n" + sports[13] + "\n" + sports[14] + "\n" +
                           sports[15] + "\n" + sports[16] + "\n" + sports[17] + "\n" + sports[18] + "\n" + sports[19] + "\n" +
                           sports[20] + "\n" + sports[21] + "\n" + sports[22] + "\n" + sports[23] + "\n" + sports[24] + "\n" +
                           sports[25] + "\n" + sports[26] + "\n" + sports[27] + "\n" + sports[28] + "\n" + sports[29]);

        System.out.println("\nSeries / Webseries:");
        System.out.println(series[0] + "\n" + series[1] + "\n" + series[2] + "\n" + series[3] + "\n" + series[4] + "\n" +
                           series[5] + "\n" + series[6] + "\n" + series[7] + "\n" + series[8] + "\n" + series[9] + "\n" +
                           series[10] + "\n" + series[11] + "\n" + series[12] + "\n" + series[13] + "\n" + series[14] + "\n" +
                           series[15] + "\n" + series[16] + "\n" + series[17] + "\n" + series[18] + "\n" + series[19] + "\n" +
                           series[20] + "\n" + series[21] + "\n" + series[22] + "\n" + series[23] + "\n" + series[24] + "\n" +
                           series[25] + "\n" + series[26] + "\n" + series[27] + "\n" + series[28] + "\n" + series[29]);

        System.out.println("\nInternational Movies:");
        System.out.println(internationalMovies[0] + "\n" + internationalMovies[1] + "\n" + internationalMovies[2] + "\n" + internationalMovies[3] + "\n" +
                           internationalMovies[4] + "\n" + internationalMovies[5] + "\n" + internationalMovies[6] + "\n" + internationalMovies[7] + "\n" +
                           internationalMovies[8] + "\n" + internationalMovies[9] + "\n" + internationalMovies[10] + "\n" + internationalMovies[11] + "\n" +
                           internationalMovies[12] + "\n" + internationalMovies[13] + "\n" + internationalMovies[14] + "\n" + internationalMovies[15] + "\n" +
                           internationalMovies[16] + "\n" + internationalMovies[17] + "\n" + internationalMovies[18] + "\n" + internationalMovies[19] + "\n" +
                           internationalMovies[20] + "\n" + internationalMovies[21] + "\n" + internationalMovies[22] + "\n" + internationalMovies[23] + "\n" +
                           internationalMovies[24] + "\n" + internationalMovies[25] + "\n" + internationalMovies[26] + "\n" + internationalMovies[27] + "\n" +
                           internationalMovies[28] + "\n" + internationalMovies[29]);

        System.out.println("\nThrillers & Action:");
        System.out.println(thrillersAction[0] + "\n" + thrillersAction[1] + "\n" + thrillersAction[2] + "\n" + thrillersAction[3] + "\n" +
                           thrillersAction[4] + "\n" + thrillersAction[5] + "\n" + thrillersAction[6] + "\n" + thrillersAction[7] + "\n" +
                           thrillersAction[8] + "\n" + thrillersAction[9] + "\n" + thrillersAction[10] + "\n" + thrillersAction[11] + "\n" +
                           thrillersAction[12] + "\n" + thrillersAction[13] + "\n" + thrillersAction[14] + "\n" + thrillersAction[15] + "\n" +
                           thrillersAction[16] + "\n" + thrillersAction[17] + "\n" + thrillersAction[18] + "\n" + thrillersAction[19] + "\n" +
                           thrillersAction[20] + "\n" + thrillersAction[21] + "\n" + thrillersAction[22] + "\n" + thrillersAction[23] + "\n" +
                           thrillersAction[24] + "\n" + thrillersAction[25] + "\n" + thrillersAction[26] + "\n" + thrillersAction[27] + "\n" +
                           thrillersAction[28] + "\n" + thrillersAction[29]);
    }
}
