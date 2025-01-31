public class Bowl {
    private int amountOfFood = 0;

    public void addFoodToBowl(int food) {
            amountOfFood += food;
            System.out.println("В миске " + amountOfFood + " еды");
        }
    }
