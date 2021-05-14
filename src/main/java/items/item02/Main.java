package items.item02;

public class Main {
    public static void main(String[] args) {
        NutritionFacts n = new NutritionFacts(0, 1);
        ImprovedNutritionFacts i = new ImprovedNutritionFacts.Builder(0, 1)
                .calories(10)
                .carbohydrate(50)
                .build();
        System.out.println(n);
        System.out.println(i);
    }
}
