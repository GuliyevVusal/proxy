package proxy;

public class VehicleProxy implements Vehicle {

    private final RealSubjet realSubjet = new RealSubjet();

    @Override
    public void drive(Person person) {
        if (!person.isHasDriverLicense()) {
            System.out.println("Siz Avtomobil idare ede bilemersiniz..!");
            return;
        }

        realSubjet.drive(person);
    }
}
