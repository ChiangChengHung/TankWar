package xz.tankwar.module.tankgenerator;

import xz.tankwar.component.tank.ComputerTank;
import static xz.tankwar.component.tank.ComputerTank.ComputerTankType.*;

public class SniperWaveGenerator extends AbstractWaveTankGenerator {
    
    public SniperWaveGenerator(int difficulty) {
        for (int i = 0; i < difficulty / 3 + 1; ++i) {
            tankList.add(new ComputerTank(SNIPER, i % 4));
        }
    }

}
