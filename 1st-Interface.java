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
///---------------------------------------------------------------------------------
        // ------------Background panel------------////
        JPanel backgroundPanel = new JPanel(new BorderLayout()) {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon taskbeeBackground = new ImageIcon("C:\\Users\\reeal\\OneDrive\\illustrator\\taskbee\\TASKBEE1-05.png");
                g.drawImage(taskbeeBackground.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
///---------------------------------------------------------------------------------
        // Center panel with BorderLayout to add components vertically
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setOpaque(false); //to be transparent 
///-----------------------------------------------------------------------------------
        // Title label << welcome to taskbee >>
        JLabel titleLabel = new JLabel("Welcome to TaskBee", JLabel.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24)); 
        titleLabel.setForeground(Color.BLACK);
//-----------------------------------------------------------------------------------------
        // Subtitle label << busy as a bee, productive as can bee >>
        JLabel subtitleLabel = new JLabel("Busy as a Bee, Productive as Can Be", JLabel.CENTER);
        subtitleLabel.setFont(new Font("Serif", Font.PLAIN, 16));
        subtitleLabel.setForeground(Color.BLACK);
//---------------------------------------------------------------------------------------------
        // <Bee name> label and <text field> 
        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePanel.setOpaque(false);
        JLabel nameLabel = new JLabel("Bee name:");
        ///textfield
        JTextField nameField = new JTextField(15);
        namePanel.add(nameLabel);
        namePanel.add(nameField);
//-------------------------------------------------------------------------------------------------
        // Enter button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        JButton enterButton = new JButton("Enter your Beehive");
        enterButton.setBackground(new Color(255, 255, 153)); // Light yellow background
        buttonPanel.add(enterButton);
//-----------------------------------------------------------------------------------------------
        // Add components in centerPanel in the correct positions
        centerPanel.add(titleLabel, BorderLayout.NORTH);
        centerPanel.add(subtitleLabel, BorderLayout.CENTER);
        centerPanel.add(namePanel, BorderLayout.SOUTH);
//----------------------------------------------------------------------------------------------------
        // Add centerPanel to background panel at center position
        backgroundPanel.add(centerPanel, BorderLayout.CENTER);
        backgroundPanel.add(buttonPanel, BorderLayout.SOUTH);
        // Add background panel to the frame
        add(backgroundPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new OO2Project();
    }
}
