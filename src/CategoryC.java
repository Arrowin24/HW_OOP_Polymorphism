public class CategoryC implements DriverLicence{
    @Override
    public boolean canDrive(Car car) {
        return (car.getClass()==Truck.class);
    }
}
