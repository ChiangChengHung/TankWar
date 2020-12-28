package xz.tankwar.module.tankgenerator;

import xz.tankwar.component.tank.ComputerTank;
import static xz.tankwar.component.tank.ComputerTank.ComputerTankType.*;

public class NormalWaveGenerator extends AbstractWaveTankGenerator {

    public NormalWaveGenerator(int difficulty) {
        for (int i = 0; i < difficulty + 1; ++i)
            tankList.add(new ComputerTank(ENEMY, i % 4));
    }
    
}
