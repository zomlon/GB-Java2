public class Main {
    public static void main(String[] args) {
        Team team = new Team("Midnight");
        team.printInformationAboutTheTeam();
        Course course = new Course();
        course.printInformationAboutTheObstacle();
        course.passObstacles(team);
        team.passedTheDistance();
    }
}
