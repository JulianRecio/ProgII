import Ex4.IntensiveCareUnit;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class IntensiveCareUnitTest {
    @Test
    public void testICU(){
        IntensiveCareUnit  icu = new IntensiveCareUnit();
        double initialCardiacReading = 80;
        double initialRespiratoryReading = 16;
        double initialArterialPressureReading = 110;
        double initialTransCutaneousOxygenReading = 97;

        icu.updateUnit(initialCardiacReading, initialRespiratoryReading, initialArterialPressureReading, initialTransCutaneousOxygenReading);

        while (icu.checkMonitor()){
            icu.updateUnit(generateRandomNumber(58, 102), generateRandomNumber(10,22), generateRandomNumber(88, 122), generateRandomNumber(93, 102));
        }

    }


    private double generateRandomNumber(double minBound, double maxBound){
        Random random = new Random();
        double randomDouble = minBound + (maxBound - minBound) * random.nextDouble();
        return randomDouble;
    }
}
