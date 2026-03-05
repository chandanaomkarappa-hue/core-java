class OttAmazonPrime {

    static String documentaries[] = {
        "Our Planet",
        "The Last Dance",
        "The Social Dilemma",
        "Inside Bill's Brain",
        "Seaspiracy",
        "13th",
        "Tiger King",
        "American Factory",
        "Night on Earth",
        "Making a Murderer",
        "Fyre Fraud",
        "The Playbook",
        "Abstract: The Art of Design",
        "Explained",
        "Dirty Money",
        "Inside Job",
        "Pandemic",
        "Cooked",
        "Chasing Coral",
        "Wild Wild Country",
        "Night Stalker",
        "The Chef Show",
        "Rotten",
        "Connected",
        "Babies",
        "High Score",
        "Cheer",
        "Pandemic: How to Prevent an Outbreak",
        "The Mind, Explained",
        "Frontline"
    };

    public static void main(String[] args) {

        getDocumentaries();

    }

    static void getDocumentaries() {
        System.out.println("The available Amazon Prime Documentaries are:");

        for(String doc : documentaries) {
            System.out.println(doc);
        }
    }
}