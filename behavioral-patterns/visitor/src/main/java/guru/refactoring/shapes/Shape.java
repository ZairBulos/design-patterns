package guru.refactoring.shapes;

import guru.refactoring.visitor.Visitor;

/**
 * Element
 */
public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
