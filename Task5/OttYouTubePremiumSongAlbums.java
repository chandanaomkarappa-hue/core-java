class OttYouTubePremiumSongAlbums {

    static String songAlbums[] = {
        "Kannada Film Hits 2025",
        "Romantic Kannada Songs",
        "Classical Kannada Album",
        "Kannada Rock Collection",
        "Kannada Devotional Songs",
        "Kannada Festival Songs",
        "Kannada Party Mix",
        "Kannada Love Ballads",
        "Old Kannada Hits",
        "Kannada Instrumentals",
        "Dance Kannada Tracks",
        "Kannada Chill Beats",
        "Kannada Wedding Songs",
        "Sad Kannada Songs",
        "Kannada Melody Album",
        "Kannada Top 50",
        "Kannada Pop Songs",
        "Kannada Folk Songs",
        "Kannada Rap Collection",
        "Kannada Evergreen Hits",
        "Kannada DJ Remixes",
        "Kannada Indie Music",
        "Kannada Hits 90s",
        "Kannada Hits 2000s",
        "Kannada Hits 2010s",
        "Kannada Hits 2020s",
        "Kannada Love Medley",
        "Kannada Playlist Vol. 1",
        "Kannada Playlist Vol. 2",
        "Kannada Chorus Songs"
    };

    public static void main(String[] args) {

        getSongAlbums();

    }

    static void getSongAlbums() {
        System.out.println("The available YouTube Premium Kannada Song Albums are:");

        for(String album : songAlbums) {
            System.out.println(album);
        }
    }
}