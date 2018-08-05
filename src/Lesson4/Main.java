package Lesson4;
import java.util.*;

public class Main {
    public static void main (String args []) {
                Cat Katze = new Cat("кошка","Мурка", "белый", "2 года " );
                Cat Kater = new Cat("кот","Барсик", "черный", "1 год");
                Dog Hund =  new Dog("пёс","Барон", "рыжий", "полгода");
                Dog Welp =  new Dog("собака","Стрелка", "серый", "3 месяца");

                System.out.println("Добро пожаловать в наш приют! Знакомьтесь:");
                Hund.info();
                Welp.info();
                Katze.info();
                Kater.info();

                List<Animal> animals = new ArrayList<Animal>();
                animals.add(Katze);
                animals.add(Kater);
                animals.add(Hund);
                animals.add(Welp);

                int randomNumber = (int)(Math.random()*4+1);
                System.out.println(randomNumber);
                if(randomNumber==1) System.out.println("Поздравляем! Вы стали счастливым обладателем кошки Мурки");
                else {
                    if (randomNumber==2) System.out.println("Поздравляем! Вы стали счастливым обладателем кота Барсика");
                    else{
                        if (randomNumber==3) System.out.println("Поздравляем! Вы стали счастливым обладателем пса Барона");
                        else System.out.println("Поздравляем! Вы стали счастливым обладателем cобаки Стрелки");
                    }
                }
            }
}