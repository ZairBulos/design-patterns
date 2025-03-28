package guru.refactoring.decorators;

/**
 * Concrete Decorator
 */
public class HelmetDecorator extends EnemyDecorator {

    public HelmetDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public double takeDamage() {
        return this.enemy.takeDamage() / 2;
    }
}
