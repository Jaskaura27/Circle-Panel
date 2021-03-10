import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainPanel extends JFrame{

    //DataPanel
    private JLabel numberOfCircleLabel;
    private JTextField numberOfCircleField;
    private JLabel smallestRadiusLabel;
    private JTextField smallestRadiusField;
    private JLabel biggestRadiusLabel;
    private JTextField biggestRadiusField;
    private double numberOfCircles=5;
    private double smallestRadius=10.0;
    private double biggestRadius=300.0;


    //ButtonPanel
    private JButton createButton;
    private JButton sortButton;
    private JButton coCentreButton;
    private JButton resetButton;

    //Panels
    private JPanel dataPanel;
    private JPanel buttonPanel;
    private DrawPanel drawPanel;

    /**
     * Crate the object MainPanel and add Panels to it.
     */
    public MainPanel(){
        createDataPanel();
        createButtonPanel();
        createDrawPanel();

    }
    /**
     * Crate a new object DrawPanel and add it to the Centre of JFrame.
     */
    private void createDrawPanel(){
        drawPanel = new DrawPanel();
        drawPanel.setPreferredSize(new Dimension(700, 700));
        add(drawPanel,BorderLayout.CENTER);
    }

    

    /**
     * create a new Panel for buttons and add it to the west of the JFrame.
     */
    private void createButtonPanel(){
        createButton = createButton("Create");
        sortButton = sortButton("Sort");
        coCentreButton = coCentreButton("Co-Centre");
        resetButton = resetButton("Reset");

        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(125, 700));
        buttonPanel.setLayout(new GridLayout(4,0));
        buttonPanel.add(createButton);
        buttonPanel.add(sortButton);
        buttonPanel.add(coCentreButton);
        buttonPanel.add(resetButton);
        add(buttonPanel,BorderLayout.WEST);

    }

    /**
     * Create a new Button and add actionlistner to it.
     * @param title
     * @return JButton which would be assigned to createButton.
     */
    private JButton createButton(String title){
        class CreateListener implements  ActionListener {
            public void actionPerformed(ActionEvent event){
                drawPanel.create((int)numberOfCircles, (int)smallestRadius, (int)biggestRadius);
            }
        }
        JButton button =new JButton(title);
        button.addActionListener(new CreateListener());
        return button;
    }

    /**
     * Create a new Button and add actionlistner to it.
     * @param title
     * @return JButton which would be assigned to sortButton.
     */
    private JButton sortButton(String title){
        class CreateListener implements  ActionListener {
            public void actionPerformed(ActionEvent event){
                drawPanel.sort();
            }
        }
        JButton button =new JButton(title);
        button.addActionListener(new CreateListener());
        return button;
    }

    /**
     * Create a new Button and add actionlistner to it.
     * @param title
     * @return JButton which would be assigned to coCentreButton.
     */
    private JButton coCentreButton(String title){
        class CreateListener2 implements  ActionListener {
            public void actionPerformed(ActionEvent event){
                drawPanel.move();
            }
        }
        JButton button =new JButton(title);
        button.addActionListener(new CreateListener2());
        return button;
    }

    /**
     * Create a new Button and add actionlistner to it.
     * @param title
     * @return JButton which would be assigned to resetButton.
     */
    private JButton resetButton(String title){
        class CreateListener3 implements  ActionListener {
            public void actionPerformed(ActionEvent event){
                drawPanel.reset();
            }
        }
        JButton button =new JButton(title);
        button.addActionListener(new CreateListener3());
        return button;
    }

    /**
     * create a new panel and add jTextFields(with actionListner attached) and jLabels.
     * and then add it to the North of the JFrame. 
     */
    private void createDataPanel(){


        double DEFAULT_CIRCLE_NUMBERS = 5;
        double DEFAULT_SMALLEST_CIRCLE_RADIUS = 10;
        double DEFAULT_BIGGEST_CIRCLE_RADIUS = 300;
        
        numberOfCircleLabel = new JLabel("Number of Circles:");
        smallestRadiusLabel = new JLabel("Radius of Smallest Circle:");
        biggestRadiusLabel = new JLabel("Radius of Biggest Circle:");

        final int FIELD_WIDTH = 10;

        numberOfCircleField = new JTextField(FIELD_WIDTH);
        numberOfCircleField.setText(""+DEFAULT_CIRCLE_NUMBERS);
        numberOfCircleField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                numberOfCircles=( Double.parseDouble(numberOfCircleField.getText()));

            }
        });

        smallestRadiusField = new JTextField(FIELD_WIDTH);
        smallestRadiusField.setText(""+ DEFAULT_SMALLEST_CIRCLE_RADIUS);
        smallestRadiusField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                smallestRadius=( Double.parseDouble(smallestRadiusField.getText()));

            }
        });

        biggestRadiusField = new JTextField(FIELD_WIDTH);
        biggestRadiusField.setText(""+DEFAULT_BIGGEST_CIRCLE_RADIUS);
        biggestRadiusField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                biggestRadius=( Double.parseDouble(biggestRadiusField.getText()));

            }
        });

        dataPanel = new JPanel();
        dataPanel.setSize(new Dimension(825,50));
        dataPanel.add(numberOfCircleLabel);
        dataPanel.add(numberOfCircleField);
        dataPanel.add(smallestRadiusLabel);
        dataPanel.add(smallestRadiusField);
        dataPanel.add(biggestRadiusLabel);
        dataPanel.add(biggestRadiusField);

        add(dataPanel,BorderLayout.NORTH);

    }


}