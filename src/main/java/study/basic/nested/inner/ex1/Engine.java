package study.basic.nested.inner.ex1;

public class Engine {
    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    public void start(){
        System.out.println("차 종 : "+car.getCarModel());
        System.out.println("충전레벨 : " + car.getChargeLevel());
    }
}
