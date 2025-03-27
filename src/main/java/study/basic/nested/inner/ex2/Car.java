package study.basic.nested.inner.ex2;


public class Car {
    private String carModel;
    private String chargeLevel;
    private Engine engine;

    public Car(String carModel, String chargeLevel) {
        this.carModel = carModel;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    void start(){
        System.out.println("car start!");
        engine.start();
    }

    private class Engine {
        public void start(){
            System.out.println("engine start!");
            System.out.println("차 종 : " + carModel);
            System.out.println("충전 레벨 : " + chargeLevel);
        }
    }
}
