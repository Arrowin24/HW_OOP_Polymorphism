public class Truck extends Car implements  Competing{

    public enum LoadCapacity{
        N1(0,3.5),
        N2(3.5,12),
        N3(12,Double.MAX_VALUE);
        double minLoad;
        double maxLoad;

        LoadCapacity(double minLoad, double maxLoad) {
            this.minLoad = minLoad;
            this.maxLoad = maxLoad;
        }

        public double getMinLoad() {
            return minLoad;
        }

        public double getMaxLoad() {
            return maxLoad;
        }
    }
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
