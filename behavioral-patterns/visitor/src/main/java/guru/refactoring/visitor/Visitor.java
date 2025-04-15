package guru.refactoring.visitor;

import guru.refactoring.shapes.Circle;
import guru.refactoring.shapes.CompoundShape;
import guru.refactoring.shapes.Dot;
import guru.refactoring.shapes.Rectangle;

/**
 * Visitor
 */
public interface Visitor {
    String visitDot(Dot dot);
    String visitCircle(Circle circle);
    String visitRectangle(Rectangle rectangle);
    String visitCompoundGraphic(CompoundShape cg);
}
