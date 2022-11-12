import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Проверка первой домашки
        PassengerCar car1 = new PassengerCar("", "", 2);
        PassengerCar car2 = new PassengerCar("Mazda", "Pazda", 2);
        PassengerCar car3 = new PassengerCar("NeMzda", "NeM", 2);
        PassengerCar car4 = new PassengerCar("Toyota", "Camry", 2);

        Truck truck1 = new Truck("truck", "trucker", 2);
        Truck truck2 = new Truck("Giga", "V7", 4);
        Truck truck3 = new Truck("High", "tr6", 4);
        Truck truck4 = new Truck("Toyota", "M4", 3);

        Bus bus1 = new Bus("VV", "T5", 2, Bus.CapacityType.Small);
        Bus bus2 = new Bus("VV", "T6", 3, Bus.CapacityType.Big);
        Bus bus3 = new Bus("VV", "T5", 2, Bus.CapacityType.ExtraBig);
        Bus bus4 = new Bus("VV", "T5", 2, Bus.CapacityType.Middle);

        //Проверка 2 и 3 домашки
        Car[] cars = {car1, car2, truck2, truck3, bus4};
        for (Car car : cars) {
            car.startMoving();
        }
        Competing[] compCars = {car1, truck2, bus2};
        for (Competing car : compCars) {
            car.maxSpeed();
        }
        //Выполнение 4 домашки
        Driver<CategoryB> driverB = new Driver<>("John", new CategoryB(), 5);
        Driver<CategoryC> driverC = new Driver<>("Jonny", new CategoryC(), 2);
        Driver<CategoryD> driverD1 = new Driver<>("Jimmy", new CategoryD(), 1);
        Driver<CategoryD> driverD2 = new Driver<>("Jimmy2", new CategoryD(), 1);

//        driverB.startMoving(car3);
//        driverC.startMoving(truck1);
//        driverD1.startMoving(bus4);
//        driverD2.startMoving(truck3);

        //Домашка №1 по коллекциям....
        Mechanic m1 = new Mechanic("Mike", "CarCompany", car2);
        Mechanic m2 = new Mechanic("Johnny", "CarCompany", car2);
        Mechanic m3 = new Mechanic("HH", "TruckCompany", truck1);

        Sponsor sponsor1 = new Sponsor("Shin", 1522);
        Sponsor sponsor2 = new Sponsor("MaShin", 4522);
        Sponsor sponsor3 = new Sponsor("SoShin", 120);


        Set<Car> raceMember = new HashSet<>();
        raceMember.add(car2);
        raceMember.add(truck1);
        raceMember.add(bus1);


        //Заполняем команду участников гонки
        {
            car2.addMechanic(m1);
            car2.addMechanic(m2);
            try {
                car2.setDriver(driverB);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            car2.getSponsors().add(sponsor1);
            car2.getSponsors().add(sponsor2);

            truck1.addMechanic(m3);
            try {
                truck1.setDriver(driverC);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            truck1.getSponsors().add(sponsor3);
            try {
                bus1.setDriver(driverD1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            for (Car car : raceMember) {
                car.printTeamInfo();
            }
        }

        //Проверка очередей...

        ServiceStation serviceStation = new ServiceStation();
        for (Car car : raceMember) {
            serviceStation.addToQueue(car);
        }

        serviceStation.doService();
    }
}