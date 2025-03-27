package study.basic.nested.inner.ex1;

public class Car {
    private String carModel;
    private String chargeLevel;
    private Engine engine;

    public Car(String carModel, String chargeLevel) {
        this.carModel = carModel;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    public String getCarModel() {
        return carModel;
    }

    public String getChargeLevel() {
        return chargeLevel;
    }

    public void start(){
        engine.start();
    }
}
