package guru.refactoring;

import guru.refactoring.ui.Player;
import guru.refactoring.ui.UI;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}