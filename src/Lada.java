public class Lada extends Car {
    public Lada(String name, int topSpeed) {
        super(name, topSpeed);
    }
    @Override
    public void classInfo() {
        System.out.println("Машина Lada принадлежит эконом классу ");
    }
}
