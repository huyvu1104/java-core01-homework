
import java.awt.Color;


public class Block {
    private int dai;
    private int rong;
    private int x;
    private int y;
    private Color c;

    public Block() {
        dai = 10;
        rong = 10;
        x = 100;
        y = 100;
        c = Color.RED;
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }
    
    
}
