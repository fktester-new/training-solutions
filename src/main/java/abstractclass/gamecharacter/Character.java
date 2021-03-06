package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private static final int MAX_DAMAGE = 10;
    private static final int MAX_DEFENCE = 5;
    private Point position;
    private int hitPoint = 100;
    Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public boolean isAlive(){
        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage(){
        return random.nextInt(MAX_DAMAGE) + 1;
    }

    private int getActualDefence(){
        return random.nextInt(MAX_DEFENCE + 1);
    }

    private void decreaseHitPoint(int diff){
        hitPoint -= diff;
    }

    protected void hit(Character enemy, int damage){
        int actualDefence = enemy.getActualDefence();
        if (actualDefence < damage){
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy){
        hit(enemy, getActualPrimaryDamage());
    }

    abstract public void secondaryAttack(Character enemy);

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }
}
