public class Cat extends Animal {
    private int runningRestriction = 200;
    private static int instatceCount = 0;
    boolean hungry = true;

    public Cat() {
        instatceCount++;
    }

    public static int getInstatceCount() {
        return instatceCount;
    }

    public void eat() {

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
}
