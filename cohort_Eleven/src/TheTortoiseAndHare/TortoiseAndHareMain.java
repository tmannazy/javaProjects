package TheTortoiseAndHare;

import java.util.Random;

public class TortoiseAndHareMain {

    public static void main(String[] args) {
        Random random = new Random();
        TortoiseAndHare tortoise = new TortoiseAndHare();
        String tortoiseMove;

//        for (int i = 0; i < 70; i++) {
            int numGenerated = 1 + random.nextInt(10);
            if (1 <= numGenerated && numGenerated <= 5) {
                tortoise.displayLines("fast plod");
//                positionDisplay = i + 3;
            } else if (6 <= numGenerated && numGenerated <= 7) {
                tortoise.displayLines("slip");
//                positionDisplay = i - 6;
            } else if (8 <= numGenerated && numGenerated <= 10) {
                tortoise.displayLines("slow pod");
//                positionDisplay = i + 1;
            }
//        }
//        tortoise.displayLines();
    }
}
