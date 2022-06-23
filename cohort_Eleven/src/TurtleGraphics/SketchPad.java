package TurtleGraphics;

import java.util.Objects;

public class SketchPad {

    String[][] drawSketchPad;


    public SketchPad(int row, int column) {
        drawSketchPad = new String[row][column];
    }

    public String[][] getSketchPad() {
        return drawSketchPad;
    }

    public String checkIfEmpty() throws Exception {
        for (String[] el : getSketchPad()) {
            for (String in_el : el) {
                if (!Objects.equals(in_el, " ")) {
                    return in_el;
                }
            }
        }
        throw new Exception("Array empty");
    }

    public void fillArray(String symbol) {
        for (String[] el : getSketchPad()) {
            for (int i = 0; i < el.length; i++) {
                if (!Objects.equals(el[i], " ")) {
                    el[i] = symbol;
                }
            }
        }
    }
}