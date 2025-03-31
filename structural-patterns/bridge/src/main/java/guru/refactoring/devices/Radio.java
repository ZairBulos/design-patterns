package guru.refactoring.devices;

/**
 * Concrete Implementation
 */
public class Radio implements Device {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return this.on;
    }

    @Override
    public void enable() {
        this.on = true;
    }

    @Override
    public void disable() {
        this.on = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent > 100) {
            this.volume = 100;
        } else if (percent < 0) {
            this.volume = 0;
        } else {
            this.volume = percent;
        }
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm radio.");
        System.out.println("| I'm " + (this.on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + this.volume + "%");
        System.out.println("| Current channel is " + this.channel);
        System.out.println("------------------------------------\n");
    }
}
