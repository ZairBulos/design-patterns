package guru.refactoring.components;

import guru.refactoring.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
