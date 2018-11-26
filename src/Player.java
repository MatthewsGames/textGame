import java.util.ArrayList;
import java.util.Scanner;
public class Player extends Entity{
    private int level;
    private int damage;
    private Weapon currentWeapon;
    private ArrayList<Item> inventory;
    private Scanner scan = new Scanner(System.in);
    private int pX;
    private int pY;
    private int numPokeyballs;
    private ArrayList<Pokeymon> pokeymon= new ArrayList<Pokeymon>();
    public Player(String n, String d, int a, int b, char c, int w,int l, int da, int p) {
        super(n,d,a,b,c,w);
        level = l;
        damage = da;
        pX = getY();
        pY = getX();
        numPokeyballs = p;
    }

    public int getDamage() {
        return damage + currentWeapon.getDamage();
    }

    public int getLevel() {
        return level;
    }
    public void printPokeymon(){
        for(Pokeymon x: pokeymon){
            System.out.println(x);
        }
    }
    public int getNumPokeymon(){
        return pokeymon.size();
    }
    public void addPokeymon(Pokeymon p){
        pokeymon.add(p);
    }
    public Pokeymon getPokeymon(int i){
        return pokeymon.get(i);
    }
    public void addItem(Item i){
        inventory.add(i);
    }
    public void input(){
        System.out.print("What would you like to do?: ");
        String input = scan.nextLine();
        pX = getX();
        pY = getY();
        if(input.equals("left") || input.toLowerCase().equals("a")){
            moveX(-1);
        }
        if(input.equals("right") || input.toLowerCase().equals("d")){
            moveX(1);
        }
        if(input.equals("up") || input.toLowerCase().equals("w")){
            moveY(-1);
        }
        if(input.equals("down") || input.toLowerCase().equals("s")){
            moveY(1);
        }

    }

    public int getNumPokeyballs() {
        return numPokeyballs;
    }

    public void setNumPokeyballs(int numPokeyballs) {
        this.numPokeyballs = numPokeyballs;
    }

    public int getPX(){
        return pX;
    }
    public int getPY(){
        return pY;
    }
}
