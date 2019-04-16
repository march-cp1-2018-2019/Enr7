public class CalculatorUI {


private JFrame frame;
private JTextField inputField;
private JLabel errorMessage;
public static void main(String[] args) {
	new CalculatorUI();
}
public CalculatorUI() {
frame = new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


 



 
		inputField = new JTextField();
inputField.setFont(inputField.getFont().deriveFont(Font.PLAIN, 26));
inputField.addActionListener(e -> calculate());
frame.add(inputField, BorderLayout.NORTH);


 errorMessage = new JLabel();
errorMessage.setForeground(Color.red);
errorMessage.setFont(errorMessage.getFont().deriveFont(Font.PLAIN, 16));
frame.add(errorMessage, BorderLayout.CENTER);


 JLabel formatLabel = new JLabel("Format: 'number operator number'");
formatLabel.setFont(formatLabel.getFont().deriveFont(Font.PLAIN, 15));
frame.add(formatLabel, BorderLayout.SOUTH);


 



 
		frame.setSize(280, 100);
		frame.setVisible(true);


 
	}


double a, b = 0;
char op = text.charAt(input[0].length());


 try {
a = Math.abs(Double.parseDouble(input[0]));
} catch (NumberFormatException ex) {

}


 



 
		try {
b = Math.abs(Double.parseDouble(input[1]));
} catch (NumberFormatException ex) {


 
			errorMessage.setText("The second operator is illegal");
return;
}


 



 
		try {
double result = Calculator.calculate(op, a, b);
if (result < 0) {


 
				errorMessage.setText("Negative numbers are illegal");
return;
}


 
}


 

