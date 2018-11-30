public class Sign extends Place{
    private String say;
    public Sign(String n, String d, int a, int b, char c, String s){
        super(n,d,a,b,c);
        say = s;
    }
    public int doThing(Player p, int map){
        System.out.println("You found a sign that says:\n" + say);
        return -1;
    }
}
