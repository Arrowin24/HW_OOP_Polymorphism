public class CategoryD implements DriverLicence{
    @Override
    public boolean canDrive(Car car) {
        return (car.getClass()==Bus.class);
    }
}
