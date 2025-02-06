public class Cat extends Animal {
    private int runningRestriction = 200;
    private static int instatceCount = 0;
    String name;
    boolean catIsHungry;
    int amountOfFoodEaten;

    public Cat(String name, boolean catIsHungry, int amountOfFoodEaten) {
        this.name = name;
        this.catIsHungry = catIsHungry;
        this.amountOfFoodEaten = amountOfFoodEaten;
        instatceCount++;
    }

    public static int getInstatceCount() {
        return instatceCount;
    }

    @Override
    void run(int lengthOfObstacleRun) {
        if (lengthOfObstacleRun < 0) {
            System.out.println("Кот не может пробежать отрицательное количество метров");
        } else if (runningRestriction >= lengthOfObstacleRun) {
            System.out.println("Кот пробежал " + lengthOfObstacleRun + " метров");
        } else {
            System.out.println("Кот не может пробежать больше 200 метров");
        }

    }

    @Override
    void swim(int lengthOfObstacleSwim) {
        System.out.println("Кот не умеет плавать");
    }

    public void theCatAte(Bowl bowl) {
        bowl.removeFromBowl(amountOfFoodEaten);
        catIsHungry = false;
    }
}
