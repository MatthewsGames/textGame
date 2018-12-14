import java.util.ArrayList;
import java.util.Scanner;
public class Player extends Entity{
    private int level;
    private Scanner scan = new Scanner(System.in);
    private int pX;
    private int pY;
    private int numPokeyballs;
    private ArrayList<Pokeymon> pokeymon= new ArrayList<Pokeymon>();
    public Player(String n, String d, int a, int b, char c, int w,int l, int da, int p) {
        super(n,d,a,b,c,w);
        level = l;
        pX = getY();
        pY = getX();
        numPokeyballs = p;
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
    public void setPokeymonHealth(int i, int health) {
        pokeymon.get(i).setHealth(health);
    }
    public void addPokeymonHealth(int i, int health) {
        pokeymon.get(i).addHealth(health);
    }
    public void subtractPokeymonHealth(int i, int health) {
        pokeymon.get(i).subtractHealth(health);
    }
    public void addPokeymon(Pokeymon p){
        pokeymon.add(p);
    }
    public Pokeymon getPokeymon(int i){
        return pokeymon.get(i);
    }
    public int getPokeymonHealth(int i){
        return pokeymon.get(i).getHealth();
    }
    public void input(){
        System.out.print("What would you like to do?(type 'h' for help): ");
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
        if(input.equals("help") || input.toLowerCase().equals("h")){
            System.out.println(
            "Main commands:\n" +
            "'h' - help\n" +
            "'a' - left\n" +
            "'w' - up\n" +
            "'s' - down\n" +
            "'d' - right\n" +
            "'p' - choose which of your pokeymon are your battle pokeymon. Must have at least 4 to change order.\n" +
            "Battle commands:\n" +
                    "'a' - attack\n" +
                    "'c' - catch wild pokeymon\n" +
                    "'r' - run\n" +
             "Symbols on the map:\n" +
                    "'@' - the player\n" +
                    "'X' - wall\n" +
                    "'H' - house wall\n" +
                    "'-' or '|' - door\n" +
                    "'?' - sign\n" +
                    "' ' - grass\n" +
                    "'#' - long grass. If you go in it you have a chance of finding a pokeymon to fight.\n" +
                    "Anything else - a person you can talk to and/or fight.\n" +
                    "Press enter to return to game..."
            );
            scan.nextLine();
        }
        if(input.equals("pokeymon") || input.toLowerCase().equals("p")){
            if(getNumPokeymon() >= 3) {
                changePokeymonOrder();
            }
            else{
                System.out.println("You need at least 3 pokeymon to change their battle order.");
            }
        }

    }
    public void changePokeymonOrder(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Current Battle Pokeymon:");
        for(int i = 0; i < 3; i++){
            System.out.println(pokeymon.get(i));
        }
        System.out.println("All Pokeymon:");
        int a = 1;
        for(Pokeymon p : pokeymon){
            System.out.println(a + ". " + p);
            a++;
        }
        int[] p = new int[3];
        for(int i = 0; i < 3; i++) {
            int b = -1;
            while(!(b >= 0 && b < getNumPokeymon())) {
                System.out.print("What pokeymon would you like as battle pokeymon #" + (i + 1) + "?(1,2,3,etc.): ");
                b = scan.nextInt() - 1;
            }
            p[i] = b;
        }
        for(int i = 0; i < 3; i++) {
            Pokeymon c = pokeymon.get(p[i]);
            pokeymon.remove(p[i]);
            pokeymon.add(i, c);
        }
        System.out.println("These are your new Battle Pokeymon:");
        for(int i = 0; i < 3; i++){
            System.out.println(pokeymon.get(i));
        }
        System.out.println("Press enter to continue...");
        scan.nextLine();
    }
    public int getNumPokeyballs() {
        return numPokeyballs;
    }
    public void setNumPokeyballs(int numPokeyballs) {
        this.numPokeyballs = numPokeyballs;
    }
    public void addPokeyballs(int numPokeyballs) {
        this.numPokeyballs += numPokeyballs;
    }
    public void subtractPokeyballs(int numPokeyballs) {
        this.numPokeyballs -= numPokeyballs;
    }

    public int getPX(){
        return pX;
    }
    public int getPY(){
        return pY;
    }
}
