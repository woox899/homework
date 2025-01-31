public abstract class Animal {
    abstract void run(int lengthOfObstacleRun);
    abstract void swim(int lengthOfObstacleSwim);

    private static int instatceCount = 0;

    public Animal() {
        instatceCount++;
    }
    public static int getInstatceCount() {
        return instatceCount;
    }
}
