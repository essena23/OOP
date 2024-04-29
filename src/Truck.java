public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        checkEngine();
        checkTrailer();
    }
    private void checkEngine() {
        System.out.println("Проверяем двигатель " + modelName);
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп " + modelName);
    }


}
