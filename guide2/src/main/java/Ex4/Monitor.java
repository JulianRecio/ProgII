package Ex4;

public class Monitor {
    private MonitorType type;
    private double actualValue;
    private double minValue;
    private double maxValue;

    public Monitor(MonitorType type, double minValue, double maxValue) {
        this.type = type;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public void setActualValue(double actualValue) {
        this.actualValue = actualValue;
    }

    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public double getActualValue() {
        return actualValue;
    }

    public double getMinValue() {
        return minValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public MonitorType getType() {
        return type;
    }

    public boolean isOutOfRange(){
        return actualValue < minValue || actualValue > maxValue;
    }
}
