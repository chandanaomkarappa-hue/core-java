class OttHotstarKannadaMovies{

    public static void main(String[] args){

        String platformName = "Hotstar Kannada Movies";

        String KGFChapter1 = "K.G.F Chapter 1";
        String KGFChapter2 = "K.G.F Chapter 2";
        String KirikParty = "Kirik Party";
        String LoveMocktail = "Love Mocktail";
        String Dia = "Dia";
        String AvaneSrimannarayana = "Avane Srimannarayana";
        String UTurn = "U-Turn";
        String BellBottom = "Bell Bottom";
        String GodhiBannaSadharanaMykattu = "Godhi Banna Sadharana Mykattu";
        String RangiTaranga = "RangiTaranga";
        String Charlie777 = "Charlie 777";
        String VikrantRona = "Vikrant Rona";
        String Mufti = "Mufti";
        String Tagaru = "Tagaru";
        String Roberrt = "Roberrt";
        String Yuvarathnaa = "Yuvarathnaa";
        String Raajakumara = "Raajakumara";
        String James = "James";
        String Kotigobba3 = "Kotigobba 3";
        String Masterpiece = "Masterpiece";
        String Googly = "Googly";
        String Gaalipata = "Gaalipata";
        String Drama = "Drama";
        String Natasaarvabhowma = "Natasaarvabhowma";
        String Ranna = "Ranna";
        String Hebbuli = "Hebbuli";
        String Addhuri = "Addhuri";
        String Milana = "Milana";
        String SimpleAgiOndhLoveStory = "Simple Agi Ondh Love Story";
        String Thithi = "Thithi";

        String movies[] = {
            KGFChapter1, KGFChapter2, KirikParty, LoveMocktail, Dia,
            AvaneSrimannarayana, UTurn, BellBottom, GodhiBannaSadharanaMykattu, RangiTaranga,
            Charlie777, VikrantRona, Mufti, Tagaru, Roberrt,
            Yuvarathnaa, Raajakumara, James, Kotigobba3, Masterpiece,
            Googly, Gaalipata, Drama, Natasaarvabhowma, Ranna,
            Hebbuli, Addhuri, Milana, SimpleAgiOndhLoveStory, Thithi
        };

        System.out.println("Platform Name: " + platformName);
        System.out.println("Kannada Movies List:");

        for (String movie : movies) {
            System.out.println(movie);
        }
    }
}
