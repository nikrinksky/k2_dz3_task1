public class ServiceStation {
    public void check(Serviceable serviceable) {
        serviceable.doService();
    }

    public void check(Transport transport) {
        transport.doService();
        System.out.println("Готовим к обслуживанию новый транспорт");
    }
}
