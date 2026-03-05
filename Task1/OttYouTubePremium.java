class OttYouTubePremium {

    static String educational[] = {
        "Learn Kannada 101",
        "Kannada Grammar Basics",
        "Storytelling in Kannada",
        "Kannada Vocabulary",
        "Kannada Writing Practice",
        "Easy Kannada Lessons",
        "Kannada Conversations",
        "Simple Kannada Phrases",
        "Kannada for Beginners",
        "Kannada Alphabet",
        "Kannada Numbers",
        "Kannada Practice #1",
        "Kannada Practice #2",
        "Kannada Speaking Tips",
        "Kannada Reading Practice",
        "Kannada Listening Skills",
        "Kannada Sentence Formation",
        "Learn Kannada Through Stories",
        "Kannada Quiz",
        "Kannada Reading Aloud",
        "Fun With Kannada Words",
        "Kannada Culture Lessons",
        "Kannada Proverbs",
        "Kannada History",
        "Speak Kannada Fast",
        "Kannada Through Songs",
        "Kannada Grammar Quiz",
        "Kannada Spelling Practice",
        "Learn Kannada Tenses",
        "Kannada Flashcards"
    };

    public static void main(String[] args) {

        getEducationalContent();

    }

    static void getEducationalContent() {
        System.out.println("The available YouTube Premium Educational Lessons are:");

        for(String lesson : educational) {
            System.out.println(lesson);
        }
    }
}