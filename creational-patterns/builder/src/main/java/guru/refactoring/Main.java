package guru.refactoring;

import guru.refactoring.builders.CarBuilder;
import guru.refactoring.builders.CarManualBuilder;
import guru.refactoring.cars.Car;
import guru.refactoring.cars.Manual;
import guru.refactoring.director.Director;

/**
 * Client
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);

        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}