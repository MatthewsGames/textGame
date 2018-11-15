import java.util.Random;
import java.util.Scanner;
public class Monster extends Entity {
    private Pokeymon[] symbols = new Pokeymon[3];
    public Monster(String n, String d, int a, int b, char c, String s1, String s2, String s3) {
        super(n, d, a, b, c);
        String[] s = {s1,s2,s3};
        for(int i = 0; i < s.length; i++){
            symbols[i] = new Pokeymon(s[i],s[i].toLowerCase(),a,b,s[i].charAt(0),1,(int)(Math.random()*20) + 1);
        }
    }
    public Pokeymon getSymbol(int i) {
        return symbols[i];
    }
    public void fight(){
        System.out.println("fight");
        setX(-1);
        setY(-1);
    }
    public void doThing() {
        Scanner scan = new Scanner(System.in);
        System.out.print(getName() + " would like to fight you.\nDo you want to fight?(Y/N): ");
        String ans = scan.next();
        if(ans.toLowerCase().equals("y")) {
            fight();
        }
    }
}
