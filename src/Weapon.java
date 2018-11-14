public class Weapon extends Item {
    private int damage;
    public Weapon(String n, String d, int a, int b, char i, int damag){
        super(n, d, a, b, i);
        damage = damag;
    }

    public int getDamage() {
        return damage;
    }
}
