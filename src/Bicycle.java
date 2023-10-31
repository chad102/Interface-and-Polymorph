public class Bicycle extends Transport implements TransportService {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doService() {
            System.out.println("Меняем покрышку" + getWheelsCount() + " раз(а)");
    }
}
