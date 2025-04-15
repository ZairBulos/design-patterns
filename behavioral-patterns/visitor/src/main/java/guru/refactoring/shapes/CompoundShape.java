package guru.refactoring.shapes;

import guru.refactoring.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Element
 */
public class CompoundShape implements Shape {
    public int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {}

    @Override
    public void draw() {}

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public int getId() {
        return id;
    }

    public void add(Shape shape) {
        children.add(shape);
    }
}
