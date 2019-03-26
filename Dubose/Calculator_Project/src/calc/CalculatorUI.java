/**
 * Abby DuBose
 * Mar 21, 2019
 */
package calc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorUI extends JFrame{
	
	
	private static final String ADD = "ADD";
	private static final String SUB = "SUB";
	private static final String MUL = "MUL";
	private static final String DIV = "DIV";
    
    private JButton addButton;
    private JButton subButton;
    private JButton mulButton;
    private JButton divButton;
    private JButton goButton;
    private JButton clearButton;
    
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton zeroButton;

    private JTextField textField;

    
    private String type;
    
    private int num1;
    private int num2;
    private int index = 0;
    
    
    
    Calculator calc= new Calculator();
    
	 public CalculatorUI() {
		initComponents();
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new CalculatorUI();
	}
	
	private void initComponents() {
        setTitle("Calculator");
		setSize(new Dimension(900, 900));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        
        //need text field
        //the dimintions thing is used for text field
        
        textField = new JTextField();
        textField.setEditable(false);
        
        Dimension dim = new Dimension(250, 20);
        textField.setPreferredSize(dim);
        textField.setMinimumSize(dim);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.add(new JLabel("calculate:"), getConstraints(0, 0));
        panel.add(textField, getConstraints(0, 1)); 
        

        
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        goButton = new JButton("=");
        clearButton = new JButton("clear");
        
        oneButton = new JButton("1");
        twoButton = new JButton("2");
        threeButton = new JButton("3");
        fourButton = new JButton("4");
        fiveButton = new JButton("5");
        sixButton = new JButton("6");
        sevenButton = new JButton("7");
        eightButton = new JButton("8");
        nineButton = new JButton("9");
        zeroButton = new JButton("0");

               
        JPanel buttonPanel = new JPanel();
        //gridlayout not flow
        //buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(addButton);
        buttonPanel.add(subButton); 
        buttonPanel.add(mulButton); 
        buttonPanel.add(divButton); 
        
        buttonPanel.add(goButton);
        buttonPanel.add(clearButton); 
        
        buttonPanel.setLayout(new GridLayout(10, 1));
        buttonPanel.add(oneButton);  
        buttonPanel.add(twoButton);  
        buttonPanel.add(threeButton);  
        buttonPanel.add(fourButton);  
        buttonPanel.add(fiveButton);  
        buttonPanel.add(sixButton);  
        buttonPanel.add(sevenButton);  
        buttonPanel.add(eightButton);  
        buttonPanel.add(nineButton);  
        buttonPanel.add(zeroButton);  


        
        addButton.addActionListener(e -> addButtonClicked());
        subButton.addActionListener(e -> subButtonClicked());
        mulButton.addActionListener(e -> mulButtonClicked());
        divButton.addActionListener(e -> divButtonClicked());
        goButton.addActionListener(e -> goButtonClicked());
        clearButton.addActionListener(e -> clearButtonClicked());
        
        oneButton.addActionListener(e -> numberClicked(1));
        twoButton.addActionListener(e -> numberClicked(2));
        threeButton.addActionListener(e -> numberClicked(3));
        fourButton.addActionListener(e -> numberClicked(4));
        fiveButton.addActionListener(e -> numberClicked(5));
        sixButton.addActionListener(e -> numberClicked(6));
        sevenButton.addActionListener(e -> numberClicked(7));
        eightButton.addActionListener(e -> numberClicked(8));
        nineButton.addActionListener(e -> numberClicked(9));
        zeroButton.addActionListener(e -> numberClicked(0));


        add(panel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        
		//pack();
		setVisible(true);
	}
	
    private GridBagConstraints getConstraints(int x, int y) {
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(5, 5, 0, 5);
        c.gridx = x;
        c.gridy = y;
        return c;
    }

	private Object clearButtonClicked() {
		calc.clear();
        textField.setText(" ");

		
		return null;
	}

	private Object goButtonClicked() {
		//not for teacher: for some reason it won't calculate
		
		String curText = this.textField.getText();
		this.textField.setText(curText + " = "); 
		
		if (type.equals(ADD)) {
			calc.add();
		} else if(type.equals(SUB)){
			calc.sub();
		} else if(type.equals(DIV)) {
			calc.div();
		} else if(type.equals(MUL)) {
			calc.mul();
		}
		
		return null;
	}
				//used for each number button
	private Object numberClicked(int n) {
		
		if(index == 0) {
			num1 = n;
			index = 1;
		} else {
			num2 = n;
			index = 0;
		}
		String curText = this.textField.getText();
		this.textField.setText(curText + " " + n + " ");
		return null;
			
	}
	private Object divButtonClicked() {	
		
		String curText = this.textField.getText();
		this.textField.setText(curText + " / "); 
		
		this.type = DIV;	
		return null;
	}

	private Object mulButtonClicked() {
		
		String curText = this.textField.getText();
		this.textField.setText(curText + " * "); 
		
		this.type = MUL;
		return null;
	}

	private Object subButtonClicked() {
		
		String curText = this.textField.getText();
		this.textField.setText(curText + " - "); 
		
		this.type = SUB;
		return null;
	}

	private Object addButtonClicked() {
		
		//need to make textfield
		String curText = this.textField.getText();
		this.textField.setText(curText + " + "); 
		//would change the + to whatever button it is
		
		this.type = ADD;
		return null;
	}


}
