package xz.tankwar.module.tankgenerator;

import xz.tankwar.component.tank.ComputerTank;
import static xz.tankwar.component.tank.ComputerTank.ComputerTankType.*;

public class EngineerWaveGenerator extends AbstractWaveTankGenerator {

    public EngineerWaveGenerator(int difficulty) {
        for (int i = 0; i < difficulty / 2 + 1; ++i) {
            tankList.add(new ComputerTank(ENGINEER, i % 4));
        }
    }

}
