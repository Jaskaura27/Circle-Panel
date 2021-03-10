

/**
   The Point2D class describes a two dimensional point 
*/
public class Point2D{
	
   private double x;
   private double y;   
   /**  
      Constructs a 2D point
   */
   public Point2D()
   {   
      x = 0;
      y = 0;

   }
   /**
      Constructs a 2D Point and initialize it
      @param x coordinate of the point
      @param y coordinate of the point
   */

  public Point2D(double x, double y)
   {   
      this.x = x;
      this.y = y;
   }
   /**
      set the coordinates of the point 
      @param x new coordinate of the center
      @param y new coordinate of the center
   */
   public void move(double x, double y)
   {   
      this.x = x;
      this.y = y;
   }
   /**
      returns x coordinate of the point 
      @return x 
   */
   public double getX()
   {   
      return x;
   }
   /**
      returns y coordinate of the point 
      @return y 
   */
   public double getY()
   {   
      return y;
   }
    /**
     override toString() method of the class
   */
   public String toString()
   {
      return "[x= "+this.x+", y= "+this.y +"]";   
   }

}