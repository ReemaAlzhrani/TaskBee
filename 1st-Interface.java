package TaskBee;
import javax.swing.*;
import java.awt.*;

public class OO2Project extends JFrame {

    public OO2Project() {
        // -------------------Set up the frame-----------------///
        setTitle("TaskBee");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(700, 500);

        // ------------Background panel------------////
        
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon beeBackground = new ImageIcon("C:\\Users\\reeal\\OneDrive\\illustrator\\taskbee\\TASKBEE1-05.png");
                g.drawImage(beeBackground.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(new GridBagLayout()); // Use GridBagLayout to center components
        //---------------------------------------------------------------------------
        
        // Center panel for labels and content
        JPanel centerPanel = new JPanel();
        // make mangerlayout to be gridboxlayout <<swing >> 
        ///the components will be added vertically 
        // تكون فوق بعضها 
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setOpaque(false); // Make transparent to show background
        
        //---------------------------------------------------------------------------
        // Title label << welcome to taskbee >>
        JLabel titleLabel = new JLabel("Welcome to TaskBee");
        // set fonts for label + bold + color
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24)); 
        titleLabel.setForeground(Color.BLACK);
        //to make alignment in the center of the box
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        ///--------------------------------------------------------------------------
        // -----Subtitle label  << busy as a bee , productive as can bee >> 
        JLabel subtitleLabel = new JLabel("Busy as a Bee, Productive as Can Be");
        subtitleLabel.setFont(new Font("Serif", Font.PLAIN, 16));
        subtitleLabel.setForeground(Color.BLACK);
        subtitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        //-----------------------------------------------------------------------------
        // ------Bee name label --------//
        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePanel.setOpaque(false); // Transparent background
        JLabel nameLabel = new JLabel("Bee name:");
        // ------text field ------------//
        JTextField nameField = new JTextField(15);
        namePanel.add(nameLabel);
        namePanel.add(nameField);
        //-----------------------------------------------------------------------------
        // -------Enter button--------//
        JButton enterButton = new JButton("Enter your Beehive");
        enterButton.setBackground(new Color(255, 255, 153));       // Light yellow background for button
        // make the alignment in the center 
        enterButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Add components to the center panel
        centerPanel.add(titleLabel);
        // to seprate between components <<spacer >> in BoxLayout 
        centerPanel.add(Box.createVerticalStrut(5));
        centerPanel.add(subtitleLabel);
        centerPanel.add(Box.createVerticalStrut(15)); 
        centerPanel.add(namePanel);
        centerPanel.add(Box.createVerticalStrut(15)); 
        centerPanel.add(enterButton);

        // Add <<center panel>> to <<background panel>>  in the center
        backgroundPanel.add(centerPanel);

        // Add background panel to frame
        add(backgroundPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new OO2Project();
    }
}
