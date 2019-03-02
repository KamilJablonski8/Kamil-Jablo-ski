public class Car {

    private String brand;
    private String color;
    private String speed;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }



    Car(String brand, String color, String speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;


    }
}
