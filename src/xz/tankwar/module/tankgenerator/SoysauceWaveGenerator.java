package xz.tankwar.module.tankgenerator;

import xz.tankwar.component.tank.ComputerTank;
import static xz.tankwar.component.tank.ComputerTank.ComputerTankType.*;
 
public class SoysauceWaveGenerator extends AbstractWaveTankGenerator {
    
    public SoysauceWaveGenerator(int difficulty) {
        for (int i = 0; i < 4; ++i) {
            tankList.add(new ComputerTank(SOY_SAUCE, difficulty % 4));
        }
    }

}
