public class Truck extends Car implements  Competing{

    public enum LoadCapacity{N1, N2, N3}
    private static final double COEF = 0.5;
    public Truck(String brand, String model, double engVolume) {
        super(brand, model, engVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Проверяю зеркало и давлю на газ");
    }

    @Override
    public void finishMoving() {
        System.out.println("Проверяю груз и давлю на тормоз");
    }

    @Override
    public void pitStop() {
        System.out.println("Пошел на пит-стоп");
    }

    @Override
    public void bestTime() {
        System.out.println("Мое лучшее время на грузовике "+COEF*Math.pow(getEngVolume(),COEF));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Мое лучшее время на грузовике "+COEF*Math.pow(getEngVolume(),COEF));
    }
}
