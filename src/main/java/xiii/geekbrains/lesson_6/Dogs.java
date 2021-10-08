package xiii.geekbrains.lesson_6;

public class Dogs extends Animals {
    private static int DOGS_COUNT;

    public Dogs(String name) {
        Animals.setAnimalsCount();
        DOGS_COUNT++;
        this.name = name;
        this.maxDistanceOfRun = 500;
        this.maxDistanceOfSwim = 10;
        this.animalType = "собака ";
    }

    public static int getDogsCount() {
        return DOGS_COUNT;
    }
}
