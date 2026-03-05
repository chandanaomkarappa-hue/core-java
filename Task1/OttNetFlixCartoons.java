class OttNetFlixCartoons {

    static String cartoons[] = {
        "Arcane",
        "Carmen Sandiego",
        "The Dragon Prince",
        "Avatar: The Last Airbender",
        "Castlevania",
        "Voltron: Legendary Defender",
        "Trollhunters",
        "Kipo and the Age of Wonderbeasts",
        "Big Mouth",
        "BoJack Horseman",
        "Inside Job",
        "F Is for Family",
        "Disenchantment",
        "Hilda",
        "Green Eggs and Ham",
        "Rilakkuma and Kaoru",
        "StarBeam",
        "Super Monsters",
        "The Epic Tales of Captain Underpants",
        "Dragon Quest: Adventure of Dai",
        "My Little Pony: Friendship Is Magic",
        "The Magic School Bus Rides Again",
        "Kid Cosmic",
        "Gabby's Dollhouse",
        "Jurassic World: Camp Cretaceous",
        "Pokemon Journeys",
        "Cocomelon",
        "Boss Baby: Back in Business",
        "She-Ra and the Princesses of Power",
        "The Willoughbys"
    };

    public static void main(String[] args) {

        getCartoons();

    }

    static void getCartoons() {
        System.out.println("The available Netflix Cartoons are:");

        for(String cartoon : cartoons) {
            System.out.println(cartoon);
        }
    }
}