public class ServiceStation {
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            transport.doService();
            System.out.println();
        }
    }
}
