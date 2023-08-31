public class Main {
    public static void main(String[] args) {
        Car car = new BMW(" 3 series", 250);
        car.getInfo();
        car.classInfo();
        Car car1 = new Lada("Vesta", 180);
        car1.getInfo();
        car1.classInfo();
        Car car2 = new Toyota("Corolla", 220);
        car2.getInfo();
        car2.classInfo();
    }
}