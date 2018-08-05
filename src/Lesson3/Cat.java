package Lesson3;

public class Cat extends Animal implements Fight {
    private final String reply;

            Cat(String sex, String name, String owner, String home, String reply){
                this.name=name;
                this.sex=sex;
                this.owner=owner;
                this.home=home;
                this.reply= reply;
            }
    @Override
    public Fight fight(Fight fighter) {
                int randomNumber = (int)(Math.random()*10);
                Fight winner;
                if (randomNumber>=5){
                    winner = this;
                }else{
                    winner =  fighter;
                }
                return winner;
            }
    @Override
    public void voice() {
                System.out.println(this.reply);
            }

            public void info(){
                System.out.println(sex+" "+" "+name+", владелец: "+ owner+", дом: "+ home);
            }
}