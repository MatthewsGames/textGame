public class Door extends Place{
    public Door(String n, String d, int a, int b, char c){
        super(n,d,a,b,c);
    }
    public int doThing(Player p,int map){
        if(map == 0 && p.getX() == 8 && p.getY() == 13){
            System.out.println(getDescription());
            return 1;
        }
        if(map == 0 && p.getX() == 3 && p.getY() == 2){
            System.out.println(getDescription());
            return 3;
        }
        if(map == 0 && p.getX() == 3 && p.getY() == 17){
            System.out.println(getDescription());
            return 4;
        }
        if(map == 0 && p.getX() == 19 && p.getY() == 17){
            System.out.println(getDescription());
            return 5;
        }
        if(map == 0 && p.getX() == 9 && p.getY() == 17){
            System.out.println(getDescription());
            return 2;
        }
        if(map == 0 && p.getX() == 5 && p.getY() == 9){
            System.out.println(getDescription());
            return 6;
        }
        if(map == 0 && p.getX() == 17 && p.getY() == 2){
            System.out.println(getDescription());
            return 7;
        }
        if(map == 0 && p.getX() == 20 && p.getY() == 5){
            System.out.println(getDescription());
            return 7;
        }
        if(map > 0){
            System.out.println(getDescription());
            return 0;
        }
        return -1;
    }
}
