package guru.refactoring.decorators;

/**
 * Base Decorator
 */
public abstract class EnemyDecorator implements Enemy {
    protected Enemy enemy;

    public EnemyDecorator(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public double takeDamage() {
        return this.enemy.takeDamage();
    }
}
