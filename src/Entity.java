public abstract class Entity extends NamedThing{
    private int x;
    private int y;
    private char image;
    public Entity(String n, String d, int a, int b, char c){
        super(n,d);
        x = a;
        y = b;
        image = c;
    }

    public char getImage() {
        return image;
    }

    public int getX() {
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int x){
        this.y = y;
    }
    public void moveX(int a){
        x += a;
    }
    public void moveY(int a){
        y += a;
    }
}
