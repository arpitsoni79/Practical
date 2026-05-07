package designPattern.factory;
public interface Car {
    void drive();
}
class SUV implements Car{
    public void drive(){
        System.out.println("SUV is running");
    }
}
class Sedan implements Car{
    public void drive(){
        System.out.println("Sedan is running");
    }
}
class CarFactory {
    public static Car getCar(String carName){
        if(carName.equalsIgnoreCase("SUV")){
            return new SUV();
        }
        if(carName.equalsIgnoreCase("Sedan")){
            return new Sedan();
        } return null;
    }
}
class FactoryDesignPattern {
    public static void main(String[] args){
        Car c1 = CarFactory.getCar("SUV");
        c1.drive();
        Car c2 = CarFactory.getCar("Sedan");
        c2.drive();
    }
}