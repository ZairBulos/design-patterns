package guru.refactoring.social_networks;

import guru.refactoring.iterators.ProfileIterator;

/**
 * Iterable Collection
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);
    ProfileIterator createCoworkersIterator(String profileEmail);
}
