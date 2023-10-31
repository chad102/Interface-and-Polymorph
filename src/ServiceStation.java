public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            car.doService();
            System.out.println();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
                truck.doService();
            System.out.println();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            bicycle.doService();
            System.out.println();
        }
    }
}
