package guru.refactoring.decorators;

/**
 * Concrete Component
 */
public class BaseEnemy implements Enemy {
    @Override
    public double takeDamage() {
        return 10;
    }
}
