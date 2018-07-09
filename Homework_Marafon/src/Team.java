import java.util.Random;

public class Team {
    private String nameTeam = "unknown";
    Animal[] zoo = {new Cat("Tom"), new Hen("Bob"), new Hippo("Jhon"), new Dog("Sam")};
    public Animal[] teamAnimal = new Animal[4];
    Random random = new Random();

    //Формируется команда

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        for(int i = 0; i < 4; i++){
            int ran = random.nextInt(4);
            teamAnimal[i] = zoo[ran];
        }
    }
    public void printInformationAboutTheTeam() {
        System.out.println("Team: " + nameTeam);
        for(Animal a : teamAnimal) {
            System.out.println(a);
            System.out.println("Run limit: " + a.run_limit);
            if (a instanceof Swimable)
                System.out.println("Swim limit: " + ((Swimable) a).getSwimLimit());
            if (a instanceof Jumpable)
                System.out.println("Jump limit: " + ((Jumpable) a).getJumpLimit());
        }
        System.out.println();
    }

    public void passedTheDistance(){
        System.out.println(nameTeam + "\n");
        for (Animal a : teamAnimal){
            if(a.passing){
                System.out.println(a + " successfully passed the distance.\n");
            } else {
                System.out.println(a + " did not pass the distance.\n");
            }
        }
        System.out.println();
    }
}