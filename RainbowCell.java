//Rainbow Cells
//This life form has cells that cycle through the colors of the rainbow. 
//The cell will follow the same rule set as the Mycoplasma, but with a color property that changes on each update.

import java.awt.Color;

public class RainbowCell extends Organism {
    private Color color;

    public RainbowCell(int x, int y) {
        super(x, y);
        color = Color.RED;
    }

    @Override
    public void update() {
        int aliveNeighbors = countAliveNeighbors();
        if (aliveNeighbors < 2) {
            alive = false;
        } else if (aliveNeighbors == 2 || aliveNeighbors == 3) {
            alive = true;
        } else {
            alive = false;
        }

        if (alive) {
            // cycle through the colors of the rainbow
            if (color.equals(Color.RED)) {
                color = Color.ORANGE;
            } else if (color.equals(Color.ORANGE)) {
                color = Color.YELLOW;
            } else if (color.equals(Color.YELLOW)) {
                color = Color.GREEN;
            } else if (color.equals(Color.GREEN)) {
                color = Color.BLUE;
            } else if (color.equals(Color.BLUE)) {
                color = Color.MAGENTA;
            } else if (color.equals(Color.MAGENTA)) {
                color = Color.RED;
            }
        }
    }

    @Override
    public Color getColor() {
        return color;
    }
}
