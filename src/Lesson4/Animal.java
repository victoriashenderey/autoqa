package Lesson4;

public abstract class Animal extends Creature {
    String name;
    String sex;
    String owner;
    String home;
    public void run(){
                System.out.println("RUN");
            }
    public void eat(){
                System.out.println("Omnomnom");
            }
    public void voice(){
                System.out.println("Рррррр");
            }
    public void fight(){}
}