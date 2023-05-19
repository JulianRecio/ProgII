package Ex4;

public class IntensiveCareUnit  {
    private final Monitor cardiacMonitor;
    private final Monitor respiratoryMonitor;
    private final Monitor arterialPressureMonitor;
    private final Monitor transCutaneousOxygenMonitor;

    public IntensiveCareUnit() {

        cardiacMonitor = new Monitor(MonitorType.CARDIAC,60, 100);
        respiratoryMonitor = new Monitor(MonitorType.RESPIRATORY,12, 20);
        arterialPressureMonitor = new Monitor(MonitorType.ARTERIAL_PRESSURE,90,120);
        transCutaneousOxygenMonitor = new Monitor(MonitorType.TRANSCUTANEOUS_OXYGEN,95, 100);

    }

    public void updateUnit(double cardiacUpdate, double respiratoryUpdate, double arterialPressureUpdate, double transCutaneousOxygenUpdate){
        cardiacMonitor.setActualValue(cardiacUpdate);
        respiratoryMonitor.setActualValue(respiratoryUpdate);
        arterialPressureMonitor.setActualValue(arterialPressureUpdate);
        transCutaneousOxygenMonitor.setActualValue(transCutaneousOxygenUpdate);
    }

    public boolean checkMonitor(){
        Monitor[] monitors = {cardiacMonitor, respiratoryMonitor, arterialPressureMonitor, transCutaneousOxygenMonitor};

        for (Monitor monitor :
                monitors) {
            if(monitor.isOutOfRange()) {
                System.out.println(monitor.getType().toString() + " is out of bounds!");
                return false;
            }
        }

        return true;
    }
}
