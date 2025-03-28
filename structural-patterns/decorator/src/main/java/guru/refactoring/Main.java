package guru.refactoring;

import guru.refactoring.decorators.ArmourDecorator;
import guru.refactoring.decorators.BaseEnemy;
import guru.refactoring.decorators.Enemy;
import guru.refactoring.decorators.HelmetDecorator;

/**
 * Client
 */
public class Main {
    public static void main(String[] args) {
        Enemy enemy = new BaseEnemy();
        Enemy enemyWithHelmet = new HelmetDecorator(enemy);
        Enemy enemyWithHelmetAndArmour = new ArmourDecorator(enemyWithHelmet);

        double computedDamage = enemyWithHelmetAndArmour.takeDamage();
        System.out.println("The damage is " + computedDamage);
    }
}