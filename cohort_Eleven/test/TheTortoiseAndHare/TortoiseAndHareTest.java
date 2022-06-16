package TheTortoiseAndHare;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

class TortoiseAndHareTest {
    Random random;
    TortoiseAndHare tortoise;

    @BeforeEach
    void setUp() {
        random = new Random();
        tortoise = new TortoiseAndHare();
//        int numGenerated = 1 + random.nextInt(10);
    }

    @Test
    void testForTortoiseFastPlodMove() {
        String tortoiseMove;
        int positionDisplay;
        int numGenerated = 1 + random.nextInt(10);
        for (int i = 0; i < 70; i++) {
            if(1 <= numGenerated && numGenerated <= 5){
                tortoiseMove = "fast plod";
                tortoise.moves(tortoiseMove);
                positionDisplay = i + 3;
            } else if (6 <= numGenerated && numGenerated <= 7){
                tortoiseMove = "slip";
                tortoise.moves(tortoiseMove);
                positionDisplay = i - 6;
            } else if (8 <= numGenerated && numGenerated <= 10){
                tortoiseMove = "slow pod";
                tortoise.moves(tortoiseMove);
                positionDisplay = i + 1;
            }            
        }


    }
}