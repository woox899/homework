import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");
        Cat cat0 = new Cat("Снежок", true, 5);

        Bowl bowl = new Bowl(0);
        bowl.refillTheBowl(20);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Мурзик", true, 10));
        cats.add(new Cat("Пушистик", true, 12));
        cats.add(new Cat("Барсик", true, 15));

        for (Cat cat : cats) {
            if (cat.catIsHungry && cat.amountOfFoodEaten < bowl.amountOfFood) {
                cat.theCatAte(bowl);
                cat.catIsHungry = false;
                System.out.println(cat.name + " - покушал");
            } else {
                System.out.println(cat.name + " - не хватило корма");
            }
        }

        dog.swim(10);
        dog.run(150);

        cat0.run(120);
        cat0.swim(10);

        System.out.println("Количество созданных котов = " + Cat.getInstatceCount());
        System.out.println("Количество созданных собак = " + Dog.getInstatceCount());
        System.out.println("Количество созданных животных = " + Animal.getInstatceCount());

        PerimeterAndAreaOfACircle circle = new PerimeterAndAreaOfACircle(
                "синий",
                "красный",
                12);

        PerimeterAndAreaOfARectangle rectangle = new PerimeterAndAreaOfARectangle(
                "оранжевый",
                "зеленый",
                12.4,
                15.7);

        PerimeterAndAreaOfATriangle triangle = new PerimeterAndAreaOfATriangle(
                "пурпурный",
                "черный",
                21,
                12,
                14);
    }
}















