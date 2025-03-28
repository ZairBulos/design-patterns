package guru.refactoring.decorators;

/**
 * Concrete Decorator
 */
public class ArmourDecorator extends EnemyDecorator {

    public ArmourDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public double takeDamage() {
        return this.enemy.takeDamage() / 1.5;
    }
}
