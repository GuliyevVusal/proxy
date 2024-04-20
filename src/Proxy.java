import proxy.Person;
import proxy.RealSubjet;
import proxy.VehicleProxy;

public class Proxy {
    public static void main(String[] args) {

        Person ali = new Person();
        ali.setName("Ali");
        ali.setSurname("Rustemov");
        ali.setHasDriverLicense(true);  // Ali Rustemov Avtomobil idare edir...

        Person orxan = new Person();
        orxan.setName("Orxan");
        orxan.setSurname("Memmedov");
        orxan.setHasDriverLicense(false); // Orxan Memmedov Avtomobil idare edir...

//        RealSubjet realSubjet = new RealSubjet();
//        realSubjet.drive(orxan);
//        realSubjet.drive(ali);

        VehicleProxy vehicleProxy = new VehicleProxy();
        vehicleProxy.drive(ali);  // Ali Rustemov Avtomobil idare edir...
        System.out.println("----------------------------");
        vehicleProxy.drive(orxan);// Siz Avtomobil idare ede bilemersiniz..!
    }
}