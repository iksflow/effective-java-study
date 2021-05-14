package items.item02;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calrories;
    private final int fat;
    private final int sodium;
    private final int carbonhydrate;


    // 필요한 매개변수만 저장하기 위해 점층적 생성자 패턴을 사용한 예
    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calrories) {
        this(servingSize, servings, calrories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calrories, int fat) {
        this(servingSize, servings, calrories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calrories, int fat, int sodium) {
        this(servingSize, servings, calrories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calrories, int fat, int sodium, int carbonhydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calrories = calrories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbonhydrate = carbonhydrate;
    }
}
