import javax.swing.JFrame;
public class MainPanelTester {
    /**
     * Creates a JFrame and test the class MainPanel
     */
    public static void main(String[] args)
    {  
       JFrame frame = new MainPanel();

       frame.setSize(1200,750);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //frame.setTitle("FontViewer");
       frame.setVisible(true);      
    }
}