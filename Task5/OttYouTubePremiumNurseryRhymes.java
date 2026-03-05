class OttYouTubePremiumNurseryRhymes {

    static String nurseryRhymes[] = {
        "Twinkle Twinkle Kannada",
        "Old MacDonald Kannada",
        "Wheels on the Bus Kannada",
        "ABC Song Kannada",
        "Counting Song Kannada",
        "Humpty Dumpty Kannada",
        "Rain Rain Go Away Kannada",
        "Baa Baa Black Sheep Kannada",
        "Mary Had a Little Lamb Kannada",
        "Itsy Bitsy Spider Kannada",
        "Head Shoulders Knees Kannada",
        "Five Little Ducks Kannada",
        "Five Little Monkeys Kannada",
        "If You're Happy Kannada",
        "Row Row Row Your Boat Kannada",
        "Peek A Boo Kannada",
        "Hickory Dickory Kannada",
        "Jack and Jill Kannada",
        "Little Bo Peep Kannada",
        "Ring Around the Rosie Kannada",
        "Baby Shark Kannada",
        "London Bridge Kannada",
        "This Old Man Kannada",
        "Bingo Kannada",
        "Skip to My Lou Kannada",
        "Pat A Cake Kannada",
        "Pop Goes the Weasel Kannada",
        "Little Miss Muffet Kannada",
        "Rain Song Kannada",
        "Sleepy Time Song Kannada"
    };

    public static void main(String[] args) {

        getNurseryRhymes();

    }

    static void getNurseryRhymes() {
        System.out.println("The available YouTube Premium Nursery Rhymes are:");

        for(String rhyme : nurseryRhymes) {
            System.out.println(rhyme);
        }
    }
}