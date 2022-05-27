package ru.skypro;


public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 3);


        Truck truck = new Truck("Truck1", 7);
        Truck truck2 = new Truck("Truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);


        ServiceStation station = new ServiceStation();
        station.check(car, truck, bicycle);
        station.check(car2, truck2, bicycle2);
    }
}