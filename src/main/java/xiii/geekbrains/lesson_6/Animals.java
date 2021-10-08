package xiii.geekbrains.lesson_6;

public abstract class Animals {
    protected static int ANIMALS_COUNT;
    protected String name;
    protected int maxDistanceOfRun;
    protected int maxDistanceOfSwim;
    protected String animalType;

    public void run(int distance) {
        if (distance < this.maxDistanceOfRun) {
            System.out.println(this.animalType + this.name + " пробежал " + distance + " метров");
        } else {
            System.out.println(this.animalType + this.name + " не может пробежать " + distance + " метров");
        }
    }

    public void swim(int distance) {
        if (distance < this.maxDistanceOfSwim) {
            System.out.println(this.animalType + this.name + " проплыл " + distance + " метров");
        } else {
            System.out.println(this.animalType + this.name + " не может проплыть " + distance + " метров");
        }
    }

    public static int getAnimalsCount() {
        return ANIMALS_COUNT;
    }
}
