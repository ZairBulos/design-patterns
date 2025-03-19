package guru.refactoring.builders;

import guru.refactoring.cars.CarType;
import guru.refactoring.components.Engine;
import guru.refactoring.components.GPSNavigator;
import guru.refactoring.components.Transmission;
import guru.refactoring.components.TripComputer;

/**
 * Builder
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
