package xz.tankwar.module.tankgenerator;

import xz.tankwar.component.tank.ComputerTank;
import static xz.tankwar.component.tank.ComputerTank.ComputerTankType.*;

public class BomberShooterWaveGenerator extends AbstractWaveTankGenerator {

    public BomberShooterWaveGenerator(int difficulty) {
        for (int i = 0; i < difficulty / 3 + 1; ++i) {
            if (i < difficulty / 6)
                tankList.add(new ComputerTank(BOMBER, i % 4));
            else
                tankList.add(new ComputerTank(SHOOTER, i % 4));
        }
    }

}
