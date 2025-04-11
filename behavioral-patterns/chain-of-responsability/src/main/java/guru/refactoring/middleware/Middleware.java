package guru.refactoring.middleware;

/**
 * Base Handler
 */
public abstract class Middleware {
    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;

        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }

        return first;
    }

    protected boolean checkNext(String email, String password) {
        if (next == null) return true;
        return next.check(email, password);
    }

    public abstract boolean check(String email, String password);
}
