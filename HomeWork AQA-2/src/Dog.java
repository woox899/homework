public class Dog extends Animal {
    private int runningRestriction = 500;
    private int swimmingRestriction = 10;
    private static int instatceCount = 0;
    String name;

    public Dog(String name) {
        this.name = name;
        instatceCount++;
    }

    public static int getInstatceCount() {
        return instatceCount;
    }

    @Override
    public void run(int lengthOfObstacleRun) {
        if (lengthOfObstacleRun < 0) {
            System.out.println("Собака не может пробежать отрицательное количество метров");
        } else if (runningRestriction >= lengthOfObstacleRun) {
            System.out.println("Собака пробежала " + lengthOfObstacleRun + " метров");
        } else {
            System.out.println("Собака не может пробежать больше 500 метров");
        }

    }

    @Override
    void swim(int lengthOfObstacleSwim) {
        if (lengthOfObstacleSwim < 0) {
            System.out.println("Собака не может проплыть отрицательное количество метров");
        } else if (swimmingRestriction >= lengthOfObstacleSwim) {
            System.out.println("Собака проплыла " + lengthOfObstacleSwim + " метров");
        } else {
            System.out.println("Собака не может проплыть больше 10 метров");
        }
    }
}
