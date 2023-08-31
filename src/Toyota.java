public class Toyota extends Car {
    public Toyota(String name, int topSpeed) {
        super(name, topSpeed);
    }
    @Override
    public void classInfo() {
        System.out.println("Машина Toyota принадлежит комфорт классу ");
    }
}
