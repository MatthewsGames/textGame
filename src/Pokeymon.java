public class Pokeymon extends Entity {
    private int damage;
    private int level;
    private int xp;
    private int health;
    public Pokeymon(String n, String d, int a, int b, char c,int l, int da) {
        super(n, d, a, b, c,999);
        damage = da;
        level = l;
        xp = 0;
        health = level * 20 + xp;
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
    public int getHealth(){
        health = level * 20 + xp;
        return health;
    }

    public int getLevel() {
        return level;
    }
}

