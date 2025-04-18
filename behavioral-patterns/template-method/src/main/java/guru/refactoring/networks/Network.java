package guru.refactoring.networks;

public abstract class Network {
    String userName;
    String password;

    public Network() {}

    /**
     * Template Method
     */
    public boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }

        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
