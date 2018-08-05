package Lesson4;

public class Dog extends Animal {
    private final String color;
    private final String age;

    Dog(String sex, String name, String color, String age) {
        this.color = color;
        this.age = age;
        this.name = name;
        this.sex = sex;
    }


    public void info(){
        System.out.println(sex+" "+name+", "+color+", "+age);
    }

}