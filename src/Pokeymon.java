public class Pokeymon extends Entity {
    private int damage;
    private int level;
    private int xp;
    public Pokeymon(String n, String d, int a, int b, char c,int l, int da) {
        super(n, d, a, b, c);
        damage = da;
        level = l;
        xp = 0;
    }
    public int getDamage() {
        return damage*level;
    }
    public void checkUpgrade(){
        if(xp >= (level + 1)*(level + 1)){
            xp -= (level + 1)*(level + 1);
            level++;
        }
    }
}

