import java.util.Objects;

public class Mechanic {
    String name;
    String company;
    Car repairCar;

    public Mechanic(String name, String company, Car repairCar) {
        this.name = name;
        this.company = company;
        this.repairCar = repairCar;
    }

    public void doMaintenance() {
        System.out.println("Делаю техобслуживание "
                + repairCar.getBrand() + " "
                + repairCar.getModel());
    }

    public void fixCar() {
        System.out.println("Вытаскиваю с того света "
                + repairCar.getBrand()
                + " " + repairCar.getModel());
    }

    @Override
    public boolean equals(Object obj) {
        Mechanic mechanic = (Mechanic) obj;
        return mechanic.name.equals(name)&&mechanic.company.equals(company)&&mechanic.repairCar.equals(repairCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, repairCar);
    }
}
