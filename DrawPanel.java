
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class DrawPanel extends JPanel{
        private ArrayList<ColorCircle> circles;


        /**
         * Create object DrawPanel.
         */
        public DrawPanel(){
            circles = new ArrayList<ColorCircle>();
        }

        /**
         * create multiple ColorCircles and add it to the arrayList circles.
         */
        public void create(int n, int sR, int bR){
            circles = new ArrayList<ColorCircle>();
            for(int i=0;i<n;i++){
                Random rand = new Random();
                int x,y,r;
                x = rand.nextInt(701)+50;
                y = rand.nextInt(701)+50;
                r = rand.nextInt(bR-sR+1)+sR;

                circles.add(new ColorCircle(x,y,r));
            }
            repaint();
        }

        /**
         * Draw ColorCircles in ArrayList circles.
         */
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            for(ColorCircle r : circles){
                r.fill(g2);
            }
        }


        /**
         * Sort the ArrayList circles in desending order of thier radius.
         */
        public void sort(){
            Collections.sort(circles);
            Collections.reverse(circles);
            repaint();
        }

        /**
         * Move ColorCircles in ArrayList to the centre of the panel.
         */
        public void move(){
            for(ColorCircle r : circles){
                r.move();
                repaint();
            }
        }

        /**
         * empty the ArrayList circles.
         */
        public void reset(){
            circles = new ArrayList<ColorCircle>();
            repaint();
        }


    }
