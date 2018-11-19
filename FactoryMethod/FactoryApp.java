package FactoryMethod;

public class FactoryApp {

    public static void main(String args[]) {
        CarMaker make = getCarByMark("Ferrari");
        Car car = make.getCar();
        car.carHeight();
        car.carWeight();
        car.tankCapacity();
    }

    public static CarMaker getCarByMark(String mark) {
        switch (mark) {
            case "Audi":
                return new AudiCarMaker();
            case "Ferrari":
                return new FerrariCarMaker();
            default:
                throw new RuntimeException("Dont have the type");
        }

    }
}

interface Car {

    public void tankCapacity();

    public void carWeight();

    public void carHeight();
}

class Audi implements Car {

    @Override
    public void tankCapacity() {
        System.out.println("4L");
    }

    @Override
    public void carWeight() {
        System.out.println("5M");
    }

    @Override
    public void carHeight() {
        System.out.println("2M");

    }

}

class Ferrari implements Car {

    @Override
    public void tankCapacity() {
        System.out.println("3L");
    }

    @Override
    public void carWeight() {
        System.out.println("4M");
    }

    @Override
    public void carHeight() {
        System.out.println("1.5M");
    }

}

interface CarMaker {

    Car getCar();
}

class AudiCarMaker implements CarMaker {

    @Override
    public Car getCar() {
        return new Audi();
    }

}

class FerrariCarMaker implements CarMaker {

    @Override
    public Car getCar() {
        return new Ferrari();
    }

}
