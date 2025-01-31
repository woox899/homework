public class Bowl {
     int amountOfFood;

     public Bowl(int amountOfFood) {
         this.amountOfFood = amountOfFood;
     }

     void refillTheBowl(int food) {
        amountOfFood += food;
         System.out.println("В миску положили " + food + " еды. В миске теперь " + amountOfFood + " еды");
    }

     void removeFromBowl(int food) {
         amountOfFood -= food;
    }
}
