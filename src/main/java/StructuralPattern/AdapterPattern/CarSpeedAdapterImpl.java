package StructuralPattern.AdapterPattern;

public class CarSpeedAdapterImpl implements CarSpeedAdapater{
    private Car currentCar;

    public CarSpeedAdapterImpl(Car currentCar) {
        this.currentCar = currentCar;
    }

    public double getSpeed() {
        return currentCar.getSpeed()/1.600d;
    }

}
