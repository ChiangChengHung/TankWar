package xz.tankwar.module.tankgenerator;

import xz.tankwar.component.tank.ComputerTank;
import static xz.tankwar.component.tank.ComputerTank.ComputerTankType.*;

public class BomberWaveGenerator extends AbstractWaveTankGenerator {

    public BomberWaveGenerator(int difficulty) {
        for (int i = 0; i < difficulty / 3 + 1; ++i) {
            tankList.add(new ComputerTank(BOMBER, i % 4));
        }
    }

}
