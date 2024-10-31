package TaskBee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OOP2Poject extends JFrame {

    private JPanel sidePanel;
    private JPanel mainPanel;

    public OOP2Poject() {

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
        JPanel addTaskPanel = new JPanel();
        JButton addTaskButton = new JButton("Add Task");
        addTaskButton.setBackground(new Color(252, 248, 119));
        addTaskButton.setFont(textFont);
        addTaskButton.setPreferredSize(new Dimension(270, 40));
        
        //panel for to do list
        JPanel taskPanel = new JPanel();
        taskPanel.setPreferredSize(new Dimension(250, 250));
        taskPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2)); 
        
        //add buttom to the panel
        addTaskPanel.add(addTaskButton);
        addTaskPanel.setBorder(BorderFactory.createEmptyBorder(45, 10, 10, 10));

        //to make border around the panel
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        mainPanel.add(greetingPanel, BorderLayout.NORTH);
        mainPanel.add(addTaskPanel, BorderLayout.CENTER);
        mainPanel.add(taskPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new OOP2Poject();
    }

}
