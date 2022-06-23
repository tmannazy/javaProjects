package TurtleGraphics;

import java.util.Objects;

public class Position {
    private int row;
    private int column;
    SketchPad sketchPad;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
        sketchPad = new SketchPad(10, 10);

    }

//    public void moveForward(int row, int column, int positionToMove) {
//        for (String[] a : sketchPad.getSketchPad()) {
//            for (int i = column; i < a.length; i++) {
//                if (!(Objects.equals(row[i], "#")) && i != positionToMove) {
//                    a[i] = "#";
//                }
//            }
//        }
//    }

//    public boolean isAtBeginning() {
//
//
//    }
}
