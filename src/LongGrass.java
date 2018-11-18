import java.util.Scanner;

public class LongGrass extends Place{
    private String Symbols[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","!","?","$","%"};
    private Pokeymon po;
    public LongGrass(String n, String d, int a, int b, char c){
        super(n,d,a,b,c);
    }
    public int doThing(Player p, int map){
        int r = (int)(Math.random()*100);
        if(r < 30){
            fightPokeymon(p,Symbols[r]);
        }
        return -1;
    }
    public void fightPokeymon(Player p, String s){
        Scanner scan = new Scanner(System.in);
        po = new Pokeymon(s,s,-1,-1,s.charAt(0),1,(int)(Math.random() * p.getPokeymon(0).getLevel() * 20 + 1));
        System.out.print("You found a " + s + ".\nWould you like to fight it?(Y/N): ");
        String a = scan.next();
        if(a.toLowerCase().equals("y")){
            System.out.println("" +
                    "===================================\n" +
                    "|                     \t" + po.getHealth() + "/***\\   |\n" +
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
                    "|\t" + p.getPokeymon(0).getHealth() + "               \\ ***** /    |\n" +
                    "| /***\\               \\_***_/     |\n" +
                    "||  "+ p.getPokeymon(0).getImage() + "  |               _|_|_      |\n" +
                    "| \\___/             *$$$$$$$$$$*  |\n" +
                    "===================================");
        }
    }
}

