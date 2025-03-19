package guru.refactoring.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Avenida San Martín 123, Ciudad de Mendoza  to Parque General San Martín, Mendoza";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
