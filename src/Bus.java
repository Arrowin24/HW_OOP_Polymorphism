public class Bus extends Car implements Competing{
    private static final double COEF = 1;
    public Bus(String brand, String model, double engVolume) {
        super(brand, model, engVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Пристегиваю детей и потихонбку стартую");
    }

    @Override
    public void finishMoving() {
        System.out.println("Проверяю сохранность детей и потихоньку торможу");
    }

    @Override
    public void pitStop() {
        System.out.println("Пошел на пит-стоп");
    }

    @Override
    public void bestTime() {
        System.out.println("Мое лучшее время на автобусе "+COEF*Math.pow(getEngVolume(),COEF));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Мое лучшее время на автобусе "+COEF*Math.pow(getEngVolume(),COEF));
    }
}
