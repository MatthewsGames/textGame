public class Pokeymon extends Entity {
    private int damage;
    private int level;
    private int xp;
    private int health;
    private int maxHealth;
    public Pokeymon(String n, String d, int a, int b, char c,int l, int da) {
        super(n, d, a, b, c,999);
        damage = da;
        level = l;
        xp = 0;
        health = level * 20 + xp;
        maxHealth = level * 20 + xp;
    }
    public int getDamage() {
        return damage*level;
    }
    public void checkUpgrade(){
        maxHealth = level * 20 + xp;
        if(xp >= (level + 1)*(level + 1)){
            xp -= (level + 1)*(level + 1);
            level++;
        }
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void addHealth(int health) {
        this.health += health;
    }
    public void subtractHealth(int health) {
        this.health -= health;
    }
    public int getMaxHealth(){
        return maxHealth;
    }
    public int getLevel() {
        return level;
    }
}

