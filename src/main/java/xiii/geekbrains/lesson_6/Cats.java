package xiii.geekbrains.lesson_6;

public class Cats extends Animals {
    private static int CATS_COUNT;

    public Cats(String name) {
        Animals.setAnimalsCount();
        CATS_COUNT++;
        this.name = name;
        this.maxDistanceOfRun = 200;
        this.animalType = "кошка ";
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать!");
    }

    public static int getCatsCount() {
        return CATS_COUNT;
    }
}
