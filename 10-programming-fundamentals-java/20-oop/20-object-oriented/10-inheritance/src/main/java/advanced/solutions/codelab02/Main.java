package advanced.solutions.codelab02;

public class Main {

    public static void main(String[] args) {
        Member[] members = new Member[]{
                new Member("member"),
                new PayingMember("paying member"),
                new FreeMember("free member"),
                new Moderator("trusted moderator", true),
                new Moderator("not trusted moderator", false)
        };


        for (Member member : members) {
            System.out.println(member.signIn());
            System.out.println(member.signIn());
            System.out.println(member.signIn());
        }

    }
}
