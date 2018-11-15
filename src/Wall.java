public class Wall extends Place{
    public Wall(String n, String d, int a, int b, char c){
        super(n,d,a,b,c);
    }
    public int doThing(Player p, int map){
        p.setX(p.getPX());
        p.setY(p.getPY());
        return -1;
    }
}
