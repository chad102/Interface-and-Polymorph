public class Car extends Transport implements TransportService{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void doService() {
        System.out.println("Меняем покрышку " + getWheelsCount() + " раз(а)");
        System.out.println("Проверяем двигатель");
    }
}
