package gb.glumov.homeWork.hw2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class VehicleTest {

    @Test
    void testCarInstanceOfVehicle(){
        Car car = new Car("Mitsubishi", "Lancer", 2007);
        Assertions.assertTrue(car instanceof Vehicle);
    }

    @Test
    void testCarCreateNumWheels(){
        Car car = new Car("Mitsubishi", "Lancer", 2007);
        Assertions.assertEquals(car.getNumWheels(), 4);
    }

    @Test
    void testMotorcycleCreateNumWheels(){
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Kroha", 2014);
        Assertions.assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    void testCarTestSpeed(){
        Car car = new Car("Mitsubishi", "Lancer", 2007);
        car.testDrive();
        Assertions.assertEquals(car.getSpeed(), 60);
    }

    @Test
    void testMotorcycleTestSpeed(){
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Kroha", 2014);
        motorcycle.testDrive();
        Assertions.assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    void testCarTestPark(){
        Car car = new Car("Mitsubishi", "Lancer", 2007);
        car.testDrive();
        car.park();
        Assertions.assertEquals(car.getSpeed(), 0);
    }

    @Test
    void testMotorcycleTestPark(){
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Kroha", 2014);
        motorcycle.testDrive();
        motorcycle.park();
        Assertions.assertEquals(motorcycle.getSpeed(), 0);
    }

}