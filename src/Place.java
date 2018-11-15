public class Place extends NamedThing{
    private int x;
    private int y;
    private char image;
    public Place(String n, String d, int a, int b, char c){
        super(n,d);
        x = a;
        y = b;
        image = c;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public char getImage() {
        return image;
    }
    public int doThing(Player p, int map){
        System.out.println(getDescription());
        return -1;
    }
}
