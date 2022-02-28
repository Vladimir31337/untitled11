package HomeWork1;




public class Team {

   private String name;
 private Member members[];

    public void winnersInfo() {
        for (int i = 0; i < members.length; i++) {
            if(members[i].isWinner()) {
                System.out.println(members[i]);
            }
        }



    }

    public void info () {

        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i]);
        }
    }

    public Team(String name, Member member1, Member member2, Member member3, Member member4) {
        this.name = name;
        members = new Member[] {member1,member2,member3,member4};
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }
}
