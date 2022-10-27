public abstract class Car {
    private String brand;
    private String model;
    private double engVolume;

    public Car(String brand, String model, double engVolume) {
        if (!brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (!model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        setEngVolume(engVolume);
    }

    public abstract void startMoving();
    public abstract void finishMoving();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngVolume() {
        return engVolume;
    }

    public void setEngVolume(double engVolume) {
        if (engVolume > 0) {
            this.engVolume = engVolume;
        } else {
            this.engVolume = 1;
        }
    }

}
