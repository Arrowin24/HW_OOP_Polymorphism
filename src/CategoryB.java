public class CategoryB implements DriverLicence{
    @Override
    public boolean canDrive(Car car) {
        return (car.getClass()==PassengerCar.class);
    }
}
