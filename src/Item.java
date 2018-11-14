public abstract class Item extends NamedThing{
    private int x;
    private int y;
    private char image;
    public Item(String n, String d, int a, int b, char i){
        super(n,d);
        x = a;
        b = y;
        i = image;
    }
    public char getImage(){
        return image;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
