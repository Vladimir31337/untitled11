package HomeWork1;

public class Member {

  private  String name;
   private int heightOfJump;
   private boolean isWinner = false;

    public Member(String name, int heightOfJump) {
        this.name = name;
        this.heightOfJump = heightOfJump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeightOfJump() {
        return heightOfJump;
    }

    public void setHeightOfJump(int heightOfJump) {
        this.heightOfJump = heightOfJump;
    }

    @Override
    public String toString() {
        return "Members{" +
                "name='" + name + '\'' +
                ", heightOfJump=" + heightOfJump +
                '}';
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }
}
