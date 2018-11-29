public class Sign extends Place{
    private String say;
    public Sign(String n, String d, int a, int b, char c, String s){
        super(n,d,a,b,c);
        s = say;
    }
    public int doThing(Player p, int map){
        System.out.println(say);
        return -1;
    }
}
