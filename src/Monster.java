import java.util.Scanner;
public class Monster extends Entity {
    private Pokeymon[] symbols = new Pokeymon[3];
    private String image;
    private String[] say;
    private int[] damages;
    private boolean alive;
    private boolean lost = false;
    private boolean battled = false;
    public Monster(String n, String d, int a, int b, char c, int w, String s1, String s2, String s3, String image, String[] say, int[] damages) {
        super(n, d, a, b, c, w);
        String[] s = {s1,s2,s3};
        this.say = say;
        this.image = image;
        this.damages = damages;
        for(int i = 0; i < s.length; i++){
            symbols[i] = new Pokeymon(s[i],s[i].toLowerCase(),a,b,s[i].charAt(0),damages[3],damages[i]);
        }
        alive = true;
    }
    public boolean isAlive(){
        return alive;
    }
    public Pokeymon getSymbol(int i) {
        return symbols[i];
    }
    public void doThing(Player p) {
        Scanner scan = new Scanner(System.in);
        System.out.print(getName() + " would like to fight you.\nDo you want to fight?(Y/N): ");
        String ans = scan.next();
        if(ans.toLowerCase().equals("y")) {
            fightPokeymon(p);
        }
        p.setX(p.getPX());
        p.setY(p.getPY());
        for(int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    public void sayThing(Player p) {
        Scanner scan = new Scanner(System.in);
        for(String x: say) {
            System.out.println(image);
            if(x.equals("givePokeymon")){
                givePokeymon(p);
            }
            if(x.equals("giveAsterisk")){
                giveAsterisk(p);
            }
            else if(x.equals("healPokeymon")){
                healPokeymon(p);
            }
            else {
                System.out.println(getName() + ": " + x + "\nPress enter to continue...");
                scan.nextLine();
            }
            for(int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
        p.setX(p.getPX());
        p.setY(p.getPY());
    }
    public void healPokeymon(Player p){
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < p.getNumPokeymon(); i++){
            p.getPokeymon(i).checkUpgrade();
            p.getPokeymon(i).setHealth(p.getPokeymon(i).getMaxHealth());
        }
    }
    public void givePokeymon(Player p){
        System.out.println("Here are your choices for your first pokeymon. You can choose A, B, or C.");
        System.out.print("Which one would you like?: ");
        Scanner scan = new Scanner(System.in);
        boolean a = false;
        while(a == false) {
            String b = scan.next();
            if (b.equals("A") || b.equals("B") || b.equals("C")) {
                p.addPokeymon(new Pokeymon(b, b, p.getX(), p.getY(), b.charAt(0), 1, 10));
                a = true;
            }
        }
    }
    public void giveAsterisk(Player p){
        p.addPokeymon(new Pokeymon("*", "The Almighty Asterisk", p.getX(), p.getY(), '*', 9, 100));
    }
    public boolean hasBattled(){
        return battled;
    }

    public boolean hasLost() {
        return lost;
    }

    public void fightPokeymon(Player p){
        int d = -1;
        int num;
        for(Pokeymon x: symbols){
            x.setHealth(x.getMaxHealth());
        }
        if(p.getNumPokeymon() < 3){
            num = p.getNumPokeymon();
        }
        else{
            num = 3;
        }
        for(int i = 0; i < num; i++){
            if(p.getPokeymon(i).getHealth() >= 0){
                d = i;
                break;
            }
        }
        if(p.getNumPokeymon() > 0 && d != -1){
            Scanner scan = new Scanner(System.in);
                boolean win = false;
                boolean end = false;
                int c = d;
                int e = 0;
                while (!end) {
                    System.out.println("" +
                            "===================================\n" +
                            "|                  \t" + symbols[e].getHealth() + "    /***\\   |\n" +
                            "|                        |  " + symbols[e].getImage() + "  |  |\n" +
                            "|                         \\___/   |\n" +
                            "|                                 |\n" +
                            "|                                 |\n" +
                            "|                                 |\n" +
                            "|                      *****      |\n" +
                            "|                    *********    |\n" +
                            "|                 /\\***********/\\ |\n" +
                            "|                 | *********** | |\n" +
                            "|                 \\/\\*********/\\/ |\n" +
                            "|\t" + p.getPokeymon(c).getHealth() + "               \\ ***** /    |\n" +
                            "| /***\\               \\_***_/     |\n" +
                            "||  " + p.getPokeymon(c).getImage() + "  |               _|_|_      |\n" +
                            "| \\___/             *$$$$$$$$$$*  |\n" +
                            "===================================");
                    System.out.print("What would you like to do?(attack, run, catch): ");
                    String inp = scan.next();
                    for(int i = 0; i < 30; i++){
                        System.out.println();
                    }
                    if (inp.toLowerCase().equals("attack") || inp.toLowerCase().equals("a")) {
                        int r = (int) (Math.random() * 5);
                        if (r == 0) {
                            System.out.println("Critical hit!");
                            symbols[e].subtractHealth(p.getPokeymon(c).getDamage() * 2);
                        } else if (r >= 4) {
                            System.out.println("Your pokeymon's attack missed!");
                        } else {
                            System.out.println("You did " + p.getPokeymon(c).getDamage() + " damage!");
                            symbols[e].subtractHealth(p.getPokeymon(c).getDamage());
                        }
                    }
                    if (inp.toLowerCase().equals("run") || inp.toLowerCase().equals("r")) {
                        int r = (int) (Math.random() * 5);
                        if (r == 1) {
                            end = true;
                        }
                    }
                    if (inp.toLowerCase().equals("catch") || inp.toLowerCase().equals("c")) {
                        System.out.println("You can't catch someone else's pokeymon.");
                        p.subtractPokeyballs(1);
                    }
                    int r = (int) (Math.random() * 5);
                    if (r == 0) {
                        System.out.println("Your opponent had a critical hit!");
                        p.getPokeymon(c).subtractHealth(symbols[e].getDamage() * 2);
                    } else if (r >= 4) {
                        System.out.println("Your opponent's attack missed!");
                    } else {
                        System.out.println("Your opponent did " + symbols[e].getDamage() + " damage!");
                        p.getPokeymon(c).subtractHealth(symbols[e].getDamage());
                    }
                    if (symbols[e].getHealth() <= 0) {
                        System.out.println("Your opponent fainted!");
                        if(e == 2) {
                            end = true;
                            win = true;
                            sayThing(p);
                            alive = false;
                        }
                        else{
                            e++;
                        }
                    }
                    if (p.getPokeymon(c).getHealth() < 0) {
                        System.out.println("Your pokeymon fainted!");
                        if (c >= 2 || c == p.getNumPokeymon() - 1) {
                            end = true;
                        } else {
                            boolean repeat = false;
                            while(!repeat) {
                                repeat = false;
                                if(c != p.getNumPokeymon() - 1) {
                                    if (p.getPokeymon(c + 1).getHealth() > 0) {
                                        c++;
                                        repeat = true;
                                    }
                                }
                                else{
                                    repeat = true;
                                }
                            }
                        }
                    }
                }
            if(win == true){
                for(int i = d; i < num; i++){
                    p.getPokeymon(i).addXP(1);
                }
            }
            else{
                lost = true;
            }
            battled = true;
            }
        }
    }
