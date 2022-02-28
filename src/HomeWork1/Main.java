package HomeWork1;

public class Main {

    public static void main(String[] args) {

        Member member1 = new Member("Vladimir", 100);
        Member member2 = new Member("Andrey", 150);
        Member member3 = new Member("Aleksei", 130);
        Member member4 = new Member("Boris", 140);

        Team team = new Team("Команда", member1,member2,member3,member4);
        Course course = new Course(110, 120 ,130);

        course.doSport(team);
        team.info();
        System.out.println("##############################");
        team.winnersInfo();

    }

}
