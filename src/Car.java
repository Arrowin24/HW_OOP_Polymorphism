import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Car {
    private String brand;
    private String model;
    private double engVolume;

    private Set<Sponsor> sponsors = new HashSet<>();
    private Driver<DriverLicence> driver;
    private Set<Mechanic> mechanics = new HashSet();

    public Car(String brand, String model, double engVolume) {
        if (!brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (!model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        setEngVolume(engVolume);
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngVolume() {
        return engVolume;
    }

    public void setEngVolume(double engVolume) {
        if (engVolume > 0) {
            this.engVolume = engVolume;
        } else {
            this.engVolume = 1;
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public void setSponsors(Set<Sponsor> sponsors) {
        this.sponsors = sponsors;
    }

    public Driver<DriverLicence> getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) throws Exception{
        if(driver.getLicence().canDrive(this)){
            this.driver = driver;
        } else {
            throw new RuntimeException("Водитель не умеет водить данный автомобиль!!!!");
        }
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public void addMechanic(Mechanic mechanic){
        if(mechanic.repairCar.getClass()==this.getClass()){
            mechanics.add(mechanic);
        } else {
            System.out.println("Этот механик не работал с данной машиной....");
        }

    }

    public void printTeamInfo(){
        System.out.println("Команда автомобиля"+getBrand()+" "+getModel());
        System.out.println("Водителя зовут "+driver.getName());
        System.out.println("Механики:");
        for (Mechanic mechanic : mechanics) {
            System.out.println(mechanic.name+" "+mechanic.company);
        }
        System.out.println("Спонсоры:");
        for (Sponsor sponsor : sponsors) {
            System.out.println(sponsor.name);
            sponsor.toSponsor();
        }
    }


}
