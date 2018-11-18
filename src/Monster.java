import java.util.Scanner;
public class Monster extends Entity {
    private Pokeymon[] symbols = new Pokeymon[3];
    public Monster(String n, String d, int a, int b, char c, int w, String s1, String s2, String s3) {
        super(n, d, a, b, c, w);
        String[] s = {s1,s2,s3};
        for(int i = 0; i < s.length; i++){
            symbols[i] = new Pokeymon(s[i],s[i].toLowerCase(),a,b,s[i].charAt(0),1,(int)(Math.random()*20) + 1);
        }
    }
    public Pokeymon getSymbol(int i) {
        return symbols[i];
    }
    public void fight(Player p){
        System.out.println("fight");
    }
    public void doThing(Player p) {
        Scanner scan = new Scanner(System.in);
        System.out.print(getName() + " would like to fight you.\nDo you want to fight?(Y/N): ");
        String ans = scan.next();
        if(ans.toLowerCase().equals("y")) {
            fight(p);
        }
        p.setX(p.getPX());
        p.setY(p.getPY());
        for(int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
