public class Truck extends Transport implements TransportService{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doService() {
        System.out.println("Меняем покрышку " + getWheelsCount() + " раз(а)");
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}
