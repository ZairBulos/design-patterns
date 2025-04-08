package guru.refactoring.iterators;

import guru.refactoring.profile.Profile;

/**
 * Iterator
 */
public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
