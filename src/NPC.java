import java.util.Scanner;
public class NPC extends Entity {

    private String[] say;
    private String image;
    private boolean permanent;
    public NPC(String n, String d, int a, int b, char c, int w, String pic, String[] script, boolean p) {
        super(n, d, a, b, c, w);
        say = script;
        image = pic;
        permanent = p;
    }
    public boolean isPermanent(){
        return permanent;
    }
    public void doThing(Player p) {
        Scanner scan = new Scanner(System.in);
        for(String x: say) {
            System.out.println(image);
            if(x.equals("inputName")){
                inputName(p);
            }
            else if(x.equals("givePokeymon")){
                givePokeymon(p);
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
    public void inputName(Player p){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name?: ");
        p.setName(scan.next());
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
}
