package xz.tankwar.module.tankgenerator;

import java.util.Random;

import xz.tankwar.component.tank.ComputerTank;
import static xz.tankwar.component.tank.ComputerTank.ComputerTankType.*;

public class RandomWaveGenerator extends AbstractWaveTankGenerator {
    
    private static Random random = new Random();
    
    public RandomWaveGenerator(int difficulty) {
        for (int i = 0; i < difficulty / 2 + 1; ++i) {
            switch (random.nextInt(6)) {
                case 0:
                case 1:
                    tankList.add(new ComputerTank(ENEMY, i % 4));
                    break;
                case 2:
                    tankList.add(new ComputerTank(SHOOTER, i % 4));
                    break;
                case 3:
                    tankList.add(new ComputerTank(SNIPER, i % 4));
                    break;
                case 4:
                    tankList.add(new ComputerTank(BOMBER, i % 4));
                    break;
                case 5:
                    tankList.add(new ComputerTank(ENGINEER, i % 4));
                    break;
            }
        }
    }
}
