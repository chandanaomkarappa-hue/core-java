class LaysChilliFlavour {

    static String ingredients[] = {
        "Potatoes",
        "Edible Vegetable Oil",
        "Salt",
        "Chilli Powder",
        "Spices",
        "Sugar",
        "Flavor Enhancer (INS 621)"
    };

    public static void main(String[] args) {

        getIngredients();

    }

    static void getIngredients() {

        System.out.println("Product Name: Lay's Chilli Flavour");
        System.out.println("Ingredients List:");

        for(String item : ingredients) {
            System.out.println(item);
        }
    }
}