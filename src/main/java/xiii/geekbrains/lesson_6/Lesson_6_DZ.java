package xiii.geekbrains.lesson_6;

/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
   Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
*/

public class Lesson_6_DZ {
    public static void main(String[] args) {
        Cats cat1 = new Cats("Барсик");
        Dogs dog1 = new Dogs("Барбос");
        Dogs dog2 = new Dogs("Малыш");

        System.out.println("Животных родилось: " + Animals.getAnimalsCount());
        System.out.println("Собак родилось: " + Dogs.getDogsCount());
        System.out.println("Кошек родилось: " + Cats.getCatsCount());

        dog1.run(300);
        cat1.run(300);
        dog2.swim(7);
        cat1.swim(2);
    }
}
