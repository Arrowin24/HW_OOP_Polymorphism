public class PassengerCar extends Car implements Competing{

    private static final double COEF = 2;

    public PassengerCar(String brand, String model, double engVolume) {
        super(brand, model, engVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Легко нажимаю на газ...");
    }

    @Override
    public void finishMoving() {
        System.out.println("Легко нажимаю на тормоз...");
    }

    @Override
    public void pitStop() {
        System.out.println("Пошел на пит-стоп");
    }

    @Override
    public void bestTime() {
        System.out.println("Мое лучшее время на легковушке "+COEF*Math.pow(getEngVolume(),COEF));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Мое лучшее время на легковушке "+COEF*Math.pow(getEngVolume(),COEF));
    }
}
