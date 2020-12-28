package xz.tankwar.module.tankgenerator;

import java.util.Random;

import xz.tankwar.component.tank.ComputerTank;
import static xz.tankwar.component.tank.ComputerTank.ComputerTankType.*;

public class AdvancedNormalWaveGenerator extends AbstractWaveTankGenerator {

    private static Random random = new Random();
    
    public AdvancedNormalWaveGenerator(int difficulty) {
        for (int i = 0; i < difficulty + 1; ++i) {
            if (random.nextInt(100) < 85)
                tankList.add(new ComputerTank(ENEMY, i % 4));
            else {
                switch (random.nextInt(4)) {
                    case 0:
                        tankList.add(new ComputerTank(SHOOTER, i % 4));
                        break;
                    case 1:
                        tankList.add(new ComputerTank(SNIPER, i % 4));
                        break;
                    case 2:
                        tankList.add(new ComputerTank(BOMBER, i % 4));
                        break;
                    case 3:
                        tankList.add(new ComputerTank(ENGINEER, i % 4));
                        break;
                }
            }
        }
    }
    
}
