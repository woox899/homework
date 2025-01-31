//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        Bowl bowl = new Bowl();
        bowl.addFoodToBowl(10);

        dog.swim(10);
        dog.run(150);

        cat.run(120);
        cat.swim(10);

        System.out.println("Количество созданных котов = " + Cat.getInstatceCount());
        System.out.println("Количество созданных собак = " + Dog.getInstatceCount());
        System.out.println("Количество созданных животных = " + Animal.getInstatceCount());

    }
}















