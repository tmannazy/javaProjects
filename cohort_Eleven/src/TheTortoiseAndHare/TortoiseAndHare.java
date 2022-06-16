package TheTortoiseAndHare;

public class TortoiseAndHare {

    void displayLines(String moveName) {
        for (int i = 0; i < 70; i++) {
            System.out.print("=");
        }
        System.out.println();
//        for (int j = 0; j < 70; j++) {
//            switch (moveName) {
//                case "fast plod" -> {
//                    System.out.print("T");
//                }
//            }
//        }
        System.out.println(moves(moveName));
    }

    String moves(String movePerSecond) {
        String position = "";
        switch (movePerSecond) {
            case "fast plod" -> {
                position = "T";
                return position;
            }
        }
        return position;
    }
}

