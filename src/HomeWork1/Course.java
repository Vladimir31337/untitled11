package HomeWork1;

public class Course {


 private  int obsts[];

    public Course(int obst1, int obst2, int obst3) {
        this.obsts = new int[]{obst1, obst2,obst3};
    }

    public void doSport(Team team) {
        for (int i = 0; i < team.getMembers().length; i++) {
            for (int j = 0; j < obsts.length; j++) {
                if (team.getMembers()[i].getHeightOfJump() < obsts [j]) {
                    team.getMembers()[i].setWinner(false);
                    break;
                }
                else {
                    team.getMembers()[i].setWinner(true);
                }
            }
        }
    }

}
