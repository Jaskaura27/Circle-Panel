import java.awt.Color;
import java.awt.Graphics2D;

public class ColorCircle extends Circle implements Comparable<ColorCircle>{
    private Color color;

    /**
     * Constructs the ColorCircle.
     */
    public ColorCircle(int x, int y, int radius){
    	super(x,y,radius);
    	color = new Color( (int)(Math.random() * 0x1000000));
    }

    /**
     * Draw the ColorCircle.
     * @param g2
     */
    public void fill(Graphics2D g2){
        super.draw(g2, color);
    }

    /**
     * move the ColorCircle to the centre of the panel.
     */
    public void move(){
        super.move(475,350);
    }
    
    /**
     * return the radius of the ColorCircle.
     */
    public double getRadius(){
        return super.getRadius();
    }

    @Override
    /**
     * Compare two ColorCircles based on thier Radius.
     */
    public int compareTo(ColorCircle other){
        if(this.getRadius()>other.getRadius()){
            return 1;
        }
        if(this.getRadius()<other.getRadius()){
            return -1;
        }
        else return 0;
    }
    
}