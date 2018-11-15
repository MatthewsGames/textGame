public class Door extends Place{
    public Door(String n, String d, int a, int b, char c){
        super(n,d,a,b,c);
    }
    public int doThing(Player p,int map){
        if(map == 0){
            System.out.println(getDescription());
            return 1;
        }
        //System.out.println(getDescription());
        return -1;
    }
}
