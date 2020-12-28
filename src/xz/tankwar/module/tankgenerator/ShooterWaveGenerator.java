package xz.tankwar.module.tankgenerator;

import xz.tankwar.component.tank.ComputerTank;
import static xz.tankwar.component.tank.ComputerTank.ComputerTankType.*;

public class ShooterWaveGenerator extends AbstractWaveTankGenerator {

    public ShooterWaveGenerator(int difficulty) {
        for (int i = 0; i < difficulty / 3 + 1; ++i) {
            tankList.add(new ComputerTank(SHOOTER, i % 4));
        }
    }

}
