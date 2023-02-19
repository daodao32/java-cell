//Life Form 1: Glowing Cell
//This life form is similar to the Mycoplasma but glows over time. 
//The cell will start with a random color and as it lives on to the next generation, the color will slowly shift to a brighter shade.

public class GlowingCell extends Cell {
    private Color color;

    public GlowingCell(int x, int y) {
        super(x, y);
        color = new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255));
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
            int red = color.getRed() + 10;
            int green = color.getGreen() + 10;
            int blue = color.getBlue() + 10;
            if (red > 255) red = 255;
            if (green > 255) green = 255;
            if (blue > 255) blue = 255;
            color = new Color(red, green, blue);
        }
    }
}
