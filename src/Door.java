public class Door extends Place{
    public Door(String n, String d, int a, int b, char c){
        super(n,d,a,b,c);
    }
    public int doThing(Player p,int map){
        if(map == 0 && p.getX() == 8 && p.getY() == 13){
            System.out.println(getDescription());
            return 1;
        }
        if(map == 0 && p.getX() == 9 && p.getY() == 17){
            System.out.println(getDescription());
            return 2;
        }
        if(map == 1){
            System.out.println(getDescription());
            return 0;
        }
        if(map == 2){
            System.out.println(getDescription());
            return 0;
        }
        return -1;
    }
}
