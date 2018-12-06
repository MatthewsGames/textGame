public abstract class Entity extends NamedThing{
    private int x;
    private int y;
    private char image;
    private int room;
    public Entity(String n, String d, int a, int b, char c,int w){
        super(n,d);
        x = a;
        y = b;
        image = c;
        room = w;
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
    public void setY(int y){
        this.y = y;
    }
    public void moveX(int a){
        x += a;
    }
    public void moveY(int a){
        y += a;
    }
    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }
    public void doThing(Player p) {
        super.doThing();
    }
    public boolean isPermanent(){
        return true;
    }
    public boolean isAlive(){
        return true;
    }
    public boolean hasBattled(){
        return false;
    }

    public boolean hasLost() {
        return false;
    }
}
