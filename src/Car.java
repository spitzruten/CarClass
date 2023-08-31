public abstract class Car {
    private String name;
    private int topSpeed;

    public Car(String name, int topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }
    public abstract void classInfo();
    public void getInfo() {
        System.out.println("Модель машины = " + name + " максимальная скорость машины = " + topSpeed + " км/ч");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSpeed() {
        return topSpeed;
    }
    public void setSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
