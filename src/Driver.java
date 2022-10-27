public class Driver<L extends DriverLicence> {
    private String name;
    private L licence;
    private int experience;

    public Driver(String name, L licence, int experience) {
        this.name = name;
        this.licence = licence;
        this.experience = experience;
    }

    public void startMoving(Car car) {
        if (licence.canDrive(car)) {
            car.startMoving();
        } else {
            System.out.println("Я не могу водоить "+car.getClass());
        }
    }

    public void finishMoving(Car car){
        if (licence.canDrive(car)) {
            car.finishMoving();
        } else {
            System.out.println("Я не могу водоить "+car.getClass()+". Мы все умрем");
        }
    }

    public void refuel(Car car){

        if (licence.canDrive(car)) {
            System.out.println("Заеду на заправку и заправлюсь");
        } else {
            System.out.println("Я не могу водоить "+car.getClass()+". Так зачем мне ее заправлять?");
        }
    }

    public void setLicence(L licence) {
        this.licence = licence;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public L getLicence() {
        return licence;
    }

    public int getExperience() {
        return experience;
    }
}
