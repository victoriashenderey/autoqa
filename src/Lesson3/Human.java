package Lesson3;

public class Human extends Creature implements Fight{
    private final String punch;
    private final int strength;
    private final int health;
    private String name;

    Human(String name, String punch, int strength, int health) {
        this.name = name;
        this.punch = punch;
        this.strength = strength;
        this.health = health;
    }

    /* @Override
     public void fight(){
             }*/
    public int getHealth() {
        return this.health;
    }

    @Override
    public Fight fight(Fight fighter) {
        return null;
    }

   /* @Override
    public Fight fight(Fight fighter) {
        int randomNumber = (int) (Math.random() * 10);
        Fight winner;
        if (randomNumber >= 5) {
            winner = this;
        } else {
            winner = fighter;
        }
        return winner;
    }*/
}