package Lesson3;

public class Main {
    public static void main (String args []) {
                Cat Katze = new Cat("кошка","Мамзель", "Мария Иосифовна", "ЖК на Остоженке","-- Моя хозяйка сошла с ума и привезла меня в Чертаново! Я хочу обратно в элитное общество!" );
                Cat Kater = new Cat("кот","Кислый", "Иван Петрович", "однушка в Чертаново","-- Эй, богачка, кошачья мята есть? А если найду?!");
                Dog Hund =  new Dog("Барон");
                Dog Welp =  new Dog(true);

                System.out.println("Добро пожаловать в наш зоопарк! Знакомьтесь:");
                Welp.voice();
                Hund.voice();
                Hund.info();
                Welp.info();
                Katze.info();Katze.voice();
                Kater.info();Kater.voice();

                System.out.println("Похоже, кошки не поделили территорию...");

                Katze.fight();
                Kater.fight();
                Human Petrovich = new Human("Иван Петрович","аперкот", 5, 100);
                Human Maria = new Human("Мария Иосифовна","вертушка", 10, 100);
                Petrovich.fight();
                Maria.getHealth();
                Maria.fight();
                Petrovich.voice();
                Hund.fight();
                Welp.fight();
                Maria.voice();
                Petrovich.run();
                Kater.run();
            }
}