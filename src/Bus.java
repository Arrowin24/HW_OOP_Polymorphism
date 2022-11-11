public class Bus extends Car implements Competing{
    public enum CapacityType{
        ExtraSmall(1,10),
        Small(11,25),
        Middle(40,50),
        Big(60,80),
        ExtraBig(100,120);

        final int minNumberSeats;
        final int maxNumberSeats;



        CapacityType(int minNumberSeats, int maxNumberSeats) {
            this.minNumberSeats = minNumberSeats;
            this.maxNumberSeats = maxNumberSeats;
        }

        public int getMinNumberSeats() {
            return minNumberSeats;
        }

        public int getMaxNumberSeats() {
            return maxNumberSeats;
        }
    }
    CapacityType capacityType;
    private static final double COEF = 1;
    public Bus(String brand, String model, double engVolume, CapacityType capacityType) {
        super(brand, model, engVolume);
        this.capacityType = capacityType;
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
