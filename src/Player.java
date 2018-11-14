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
    public Player(String n, String d, int a, int b, char c,int l, int da) {
        super(n,d,a,b,c);
        level = l;
        damage = da;
        pX = getY();
        pY = getX();
    }

    public int getDamage() {
        return damage + currentWeapon.getDamage();
    }

    public int getLevel() {
        return level;
    }
    public void printInventory(){
        for(Item x: inventory){
            System.out.println(x);
        }
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
}
