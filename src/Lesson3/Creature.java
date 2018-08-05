package Lesson3;

public abstract class Creature implements Fight {
    public abstract void fight();
    public void run(){
                System.out.println("Убегает");
            }
    public void voice(){
                System.out.println("AAAAAAaaaaa!!!11");
            }
}