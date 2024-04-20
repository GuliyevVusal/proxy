package proxy;

public class RealSubjet implements Vehicle{
    @Override
    public void drive(Person person) {
        System.out.println(person.getName() +" "+ person.getSurname()+" "+ "Avtomobil idare edir...");
    }
}
