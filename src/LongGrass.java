import java.util.Scanner;

public class LongGrass extends Place{
    private char Symbols[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','!','?','$','%'};;
    public LongGrass(String n, String d, int a, int b, char c){
        super(n,d,a,b,c);
    }
    public void doThing(Player p){
        int r = (int)(Math.random()*100);
        if(r <= 30){
            fightPokeymon(p,Symbols[r]);
        }
    }
    public void fightPokeymon(Player p, char s){
        Scanner scan = new Scanner(System.in);
        System.out.print("You found a " + s + ".\nWould you like to fight it?(Y/N): ");
        String a = scan.next();
        if(a.toLowerCase().equals("y")){
            System.out.println("" +
                    "===================================" +
                    "|                         /***\\   |" +
                    "|                        |  " + s + "  |  |" +
                    "|                         \\___/   |" +
                    "|                                 |" +
                    "|                                 |" +
                    "|                                 |" +
                    "|                      *****      |" +
                    "|                    *********    |" +
                    "|                 /\\***********/\\ |" +
                    "|                 | *********** | |" +
                    "|                 \\/\\*********/\\/ |" +
                    "|                    \\ ***** /    |" +
                    "| /***\\               \\_***_/     |" +
                    "||  "+ p.getPokeymon(0) + "  |               _|_|_      |" +
                    "| \\___/             *$$$$$$$$$$*  |" +
                    "===================================");
        }
        else{

        }
    }
}

