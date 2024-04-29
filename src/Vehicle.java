public abstract class Vehicle implements Serviceable {
    protected final String modelName;
    protected final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем колеса " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
