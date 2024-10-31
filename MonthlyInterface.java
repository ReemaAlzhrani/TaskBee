
package TaskBee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Monthly_Tasks extends JFrame{
    
    private JPanel sidePanel;
    private JPanel mainPanel;
    private JPanel JPanel;

    public Monthly_Tasks() {

        // ----- Setting the Frame -----
        setTitle("TaskBee");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(700, 500);
        setLayout(new BorderLayout());

        // ----- Setting the Panels in methods -----
        buildSidePanel();
        buildMainPanel();

        add(sidePanel, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }
    
    
    
     public void buildSidePanel() {
        sidePanel = new JPanel();
        sidePanel.setLayout(new GridLayout(3, 1));
        JButton DailyButton = new JButton("Daily");
        JButton MonthlyButton = new JButton("Monthly");
        JButton settingButton = new JButton("Setting");

        // setting the colors of the buttons
        DailyButton.setBackground(new Color(239, 213, 16));
        MonthlyButton.setBackground(new Color(255, 222, 77));
        settingButton.setBackground(new Color(252, 248, 119));
         
     
        
        //setting the font of the buttons
        Font mainFont = new Font("Times New Roman", Font.BOLD, 22);
        DailyButton.setFont(mainFont);
        MonthlyButton.setFont(mainFont);
        settingButton.setFont(mainFont);

        //setting an image to the button
        ImageIcon settingIcon = new ImageIcon("C://Users//جوري//Downloads//settings.png/");
        settingButton.setIcon(settingIcon);

        sidePanel.add(DailyButton);
        sidePanel.add(MonthlyButton);
        sidePanel.add(settingButton);
    }
     
         public void buildMainPanel() {
        
        // --------- Greeting Message "top section" ---------
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel greetingPanel = new JPanel();
        greetingPanel.setLayout(new GridLayout(2, 1));

        JLabel greeting = new JLabel("Good Day, Latifa!");
        JLabel subGreeting = new JLabel("Buzz through your To-Do-List");

        //setting the font
        Font titleFont = new Font("Times New Roman", Font.BOLD, 30);
        Font textFont = new Font("Times New Roman", Font.PLAIN, 22);
        greeting.setFont(titleFont);
        subGreeting.setFont(textFont);
        
        greetingPanel.add(greeting);
        greetingPanel.add(subGreeting);
        
       
        // --------- Tasks section ---------
      
      JPanel tasksPanel = new JPanel(new BorderLayout());
      

       // Panel for month buttons
     JPanel monthsPanel = new JPanel(new GridLayout(1, 12)); // 1 row and 12 columns
     String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", 
         "September", "October", "November", "December"};


      // Define yellow shades
     Color[] yellowShades = 
     {
     new Color(239, 213, 16),  
     new Color(255, 222, 77),  
     new Color(252, 248, 119), 

     };



// Loop through each month and create a button with a specific yellow shade background
for (int i =0 ; i< months.length;i++) {
    JButton monthButton = new JButton(months[i]);
    monthButton.setFont(new Font("Arial", Font.BOLD, 12));
    monthButton.setFocusPainted(true);
    monthButton.setOpaque(true);
    monthButton.setBorderPainted(false);
    
    
    monthButton.setBackground(yellowShades[i%yellowShades.length]);
    monthsPanel.add(monthButton);

}

     // Add months panel to the top of tasksPanel
    tasksPanel.add(monthsPanel, BorderLayout.NORTH);

     // Grid panel for the 30 days 
    JPanel gridPanel = new JPanel(new GridLayout(5, 6, 5, 5));
    gridPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 

    // Adding 30 day panels to the grid panel
    for (int day = 1; day <= 30; day++) {
    JPanel dayPanel = new JPanel(new BorderLayout());
    dayPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    // Label for days number at "bottom-right corner"
    JLabel dayLabel = new JLabel(String.valueOf(day), SwingConstants.RIGHT);
    dayLabel.setFont(new Font("Arial", Font.PLAIN, 10));
    dayPanel.add(dayLabel, BorderLayout.SOUTH);

    gridPanel.add(dayPanel);
}



   
// Add tasksPanel to the main panel 
   
   mainPanel.add(tasksPanel, BorderLayout.CENTER);

// Add the grid panel to the tasksPanel
   
   tasksPanel.add(gridPanel, BorderLayout.CENTER);
   
//to make border around the panel
   
   mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
   mainPanel.add(greetingPanel, BorderLayout.NORTH);
   
   tasksPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 
  


       
        
    }
    
    
    
    
    
    
}
