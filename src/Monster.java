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
    public void fightPokeymon(Player p, String s){
        int d = -1;
        int num;
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
            Pokeymon[] po = {new Pokeymon(s,s,-1,-1,s.charAt(0),1,(int)(Math.random() * p.getPokeymon(0).getLevel() * 20 + 1)),new Pokeymon(s,s,-1,-1,s.charAt(0),1,(int)(Math.random() * p.getPokeymon(0).getLevel() * 20 + 1)),new Pokeymon(s,s,-1,-1,s.charAt(0),1,(int)(Math.random() * p.getPokeymon(0).getLevel() * 20 + 1))};
            System.out.print("You found a " + s + ".\nWould you like to fight it?(Y/N): ");
            String a = scan.next();
            if(a.toLowerCase().equals("y")) {
                boolean win = false;
                boolean end = false;
                int c = d;

                while (!end) {
                    System.out.println("" +
                            "===================================\n" +
                            "|                   \t" + po[0].getHealth() + " /***\\   |\n" +
                            "|                        |  " + s + "  |  |\n" +
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
                    if (inp.toLowerCase().equals("attack") || inp.toLowerCase().equals("a")) {
                        int r = (int) (Math.random() * 5);
                        if (r == 0) {
                            System.out.println("Critical hit!");
                            po[0].subtractHealth(p.getPokeymon(c).getDamage() * 2);
                        } else if (r >= 4) {
                            System.out.println("Your pokeymon's attack missed!");
                        } else {
                            System.out.println("You did " + p.getPokeymon(c).getDamage() + " damage!");
                            po[0].subtractHealth(p.getPokeymon(c).getDamage());
                        }
                    }
                    if (inp.toLowerCase().equals("run") || inp.toLowerCase().equals("r")) {
                        int r = (int) (Math.random() * 5);
                        if (r == 1) {
                            end = true;
                        }
                    }
                    if (inp.toLowerCase().equals("catch") || inp.toLowerCase().equals("c")) {
                        int r = (int) (Math.random() * po[0].getHealth() / 10);
                        if (p.getNumPokeyballs() > 0) {
                            if (r == 0) {
                                System.out.println("You caught it!");
                                p.subtractPokeyballs(1);
                                p.addPokeymon(po[0]);
                                System.out.println("You have " + p.getNumPokeyballs() + " pokeyballs left.");
                                win = true;
                                end = true;
                            } else {
                                System.out.println("The pokeymon broke out!");
                                p.subtractPokeyballs(1);
                                System.out.println("You have " + p.getNumPokeyballs() + " pokeyballs left.");
                            }
                        } else {
                            System.out.println("You don't have any pokeyballs!");
                        }
                    }
                    int r = (int) (Math.random() * 5);
                    if (r == 0) {
                        System.out.println("Your opponent had a critical hit!");
                        p.getPokeymon(c).subtractHealth(po[0].getDamage() * 2);
                    } else if (r >= 4) {
                        System.out.println("Your opponent's attack missed!");
                    } else {
                        System.out.println("Your opponent did " + po[0].getDamage() + " damage!");
                        p.getPokeymon(c).subtractHealth(po[0].getDamage());
                    }
                    if (po[0].getHealth() <= 0) {
                        System.out.println("Your opponent fainted!");
                        end = true;
                        win = true;
                    } else if (p.getPokeymon(c).getHealth() < 0) {
                        System.out.println("Your pokeymon fainted!");
                        if (c >= 2 || c == p.getNumPokeymon() - 1) {
                            end = true;
                        } else {
                            boolean repeat = false;
                            while(!repeat) {
                                repeat = false;
                                if(c != p.getNumPokeymon() - 1) {
                                    if (p.getPokeymon(c + 1).getHealth() >= 0) {
                                        c++;
                                    } else {
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
            }
        }
    }
}
