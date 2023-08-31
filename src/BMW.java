public class BMW extends Car {
    public BMW(String name, int topSpeed) {
        super(name, topSpeed);
    }
    @Override
    public void classInfo() {
        System.out.println("Машина BMW принадлежит к бизнес классу ");
    }
}
