package StructuralPattern.AdapterPattern;

public class MainRunner {
    public static void main(String[] args) {
        TataMotors tataMotors = new TataMotors();
        CarSpeedAdapterImpl carSpeedAdapter = new CarSpeedAdapterImpl(tataMotors);
        System.out.println(carSpeedAdapter.getSpeed());
    }
}
