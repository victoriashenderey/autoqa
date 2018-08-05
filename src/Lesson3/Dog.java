package Lesson3;

public class Dog extends Animal implements Fight {

            Dog(Boolean home, String name) {
                this.home = "true";
                this.name = name;
            }

            Dog(String name) {
                this.name = name;
            }

            Dog(Boolean home) {
                this.home = "true";
            }

            public void info() {
                if (home == null || home != "true") {
                        System.out.print("бездомный пёс ");
                    } else System.out.print("домашний пёс ");
                if (name == null) {
                        System.out.println("без имени");
                    } else System.out.println(name);
            }

            public void voice() {
                System.out.println("Wuf-wuf ");
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
}