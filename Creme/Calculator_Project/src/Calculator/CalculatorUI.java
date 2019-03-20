import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calculator {
	boolean autoRoundOn = true;
	double operationA = 0;
	String operationAText = "";
	boolean aInUse = true;
	double operationB = 0;
	boolean bInUse = false;
	String operation = "";
}

public class CalculatorUI extends JFrame {
	JTextField text = new JTextField("");
	JButton one = new JButton(" 1 ");
	JButton two = new JButton(" 2 ");
	JButton three = new JButton(" 3 ");
	JButton four = new JButton(" 4 ");
	JButton five = new JButton(" 5 ");
	JButton six = new JButton(" 6 ");
	JButton seven = new JButton(" 7 ");
	JButton eight = new JButton(" 8 ");
	JButton nine = new JButton(" 9 ");
	JButton zero = new JButton(" 0 ");
	JButton plus = new JButton(" + ");
	JButton min = new JButton(" - ");
	JButton times = new JButton(" x ");
	JButton divide = new JButton(" / ");
	JButton clear = new JButton(" clear ");
	JButton equals = new JButton(" = ");
	JPanel numpad = new JPanel();
	JPanel clearPanel = new JPanel();
	JPanel backround = new JPanel();

	Calculator calc = new Calculator();

	public void FutureValueFrame() {
		InitComponent();

	}

	public static void main(String[] args) {
		CalculatorUI gui = new CalculatorUI();
		gui.FutureValueFrame();

	}

	private void InitComponent() {

		setTitle("Calculator");
		GridBagLayout layout = new GridBagLayout();
		numpad.setLayout(layout);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationByPlatform(true);
		numpad.setBackground(Color.yellow);
		clearPanel.setBackground(Color.yellow);
		backround.setBackground(Color.yellow);

		text.setEditable(false);
		text.setPreferredSize(new Dimension(242, 30));
		one.addActionListener(new oneButtonClicked());
		two.addActionListener(new twoButtonClicked());
		three.addActionListener(new threeButtonClicked());
		four.addActionListener(new fourButtonClicked());
		five.addActionListener(new fiveButtonClicked());
		six.addActionListener(new sixButtonClicked());
		seven.addActionListener(new sevenButtonClicked());
		eight.addActionListener(new eightButtonClicked());
		nine.addActionListener(new nineButtonClicked());
		zero.addActionListener(new zeroButtonClicked());
		plus.addActionListener(new plusButtonClicked());
		min.addActionListener(new minButtonClicked());
		times.addActionListener(new timesButtonClicked());
		divide.addActionListener(new divideButtonClicked());
		clear.addActionListener(new clearButtonClicked());
		equals.addActionListener(new equalsButtonClicked());
		clear.setPreferredSize(new Dimension(236, 30));

		GridBagConstraints location = getConstraints(0, 0);
		location = getConstraints(0, 3);
		numpad.add(one, location);
		location = getConstraints(1, 3);
		numpad.add(two, location);
		location = getConstraints(2, 3);
		numpad.add(three, location);
		location = getConstraints(3, 3);
		numpad.add(plus, location);
		location = getConstraints(0, 4);
		numpad.add(four, location);
		location = getConstraints(1, 4);
		numpad.add(five, location);
		location = getConstraints(2, 4);
		numpad.add(six, location);
		location = getConstraints(3, 4);
		numpad.add(min, location);
		location = getConstraints(0, 5);
		numpad.add(seven, location);
		location = getConstraints(1, 5);
		numpad.add(eight, location);
		location = getConstraints(2, 5);
		numpad.add(nine, location);
		location = getConstraints(3, 5);
		numpad.add(times, location);
		location = getConstraints(1, 6);
		numpad.add(zero, location);
		location = getConstraints(2, 6);
		numpad.add(equals, location);
		location = getConstraints(3, 6);
		numpad.add(divide, location);

		backround.setLayout(new GridBagLayout());
		location = getConstraints(0, 1);
		backround.add(text, location);

		location = getConstraints(0, 2);
		clearPanel.setLayout(new FlowLayout());
		clearPanel.add(clear);

		backround.add(clearPanel, location);

		location = getConstraints(0, 3);
		backround.add(numpad, location);

		add(backround);
		pack();
		setVisible(true);
	}

	class oneButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if (calc.aInUse) {
				try {
					calc.operationA = calc.operationA * 10 + 1;
					if (calc.operationA > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText("" + Math.round(calc.operationA));
						} else {
							text.setText("" + calc.operationA);
						}
					}
				} catch (Exception e) {
					calc.operationA = 0;
					text.setText("Number To Big");
				}
			} else {
				try {
					turnOffOperations();
					calc.operationB = calc.operationB * 10 + 1;
					if (calc.operationB > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText(calc.operationAText + Math.round(calc.operationB));
						} else {
							text.setText(calc.operationAText + calc.operationB);						}
					}
				} catch (Exception e) {
					calc.operationB = 0;
					text.setText("Number To Big");
				}
			}
		}
	}

	class twoButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if (calc.aInUse) {
				try {
					calc.operationA = calc.operationA * 10 + 2;
					if (calc.operationA > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText("" + Math.round(calc.operationA));
						} else {
							text.setText("" + calc.operationA);
						}
					}
				} catch (Exception e) {
					calc.operationA = 0;
					text.setText("Number To Big");
				}
			} else {
				try {
					turnOffOperations();
					calc.operationB = calc.operationB * 10 + 2;
					if (calc.operationB > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText(calc.operationAText + Math.round(calc.operationB));
						} else {
							text.setText(calc.operationAText + calc.operationB);						}
					}
				} catch (Exception e) {
					calc.operationB = 0;
					text.setText("Number To Big");
				}
			}
		}
	}

	class threeButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if (calc.aInUse) {
				try {
					calc.operationA = calc.operationA * 10 + 3;
					if (calc.operationA > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText("" + Math.round(calc.operationA));
						} else {
							text.setText("" + calc.operationA);
						}
					}
				} catch (Exception e) {
					calc.operationA = 0;
					text.setText("Number To Big");
				}
			} else {
				try {
					turnOffOperations();
					calc.operationB = calc.operationB * 10 + 3;
					if (calc.operationB > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText(calc.operationAText + Math.round(calc.operationB));
						} else {
							text.setText(calc.operationAText + calc.operationB);						}
					}
				} catch (Exception e) {
					calc.operationB = 0;
					text.setText("Number To Big");
				}
			}
		}
	}

	class fourButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if (calc.aInUse) {
				try {
					calc.operationA = calc.operationA * 10 + 4;
					if (calc.operationA > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText("" + Math.round(calc.operationA));
						} else {
							text.setText("" + calc.operationA);
						}
					}
				} catch (Exception e) {
					calc.operationA = 0;
					text.setText("Number To Big");
				}
			} else {
				try {
					turnOffOperations();
					calc.operationB = calc.operationB * 10 + 4;
					if (calc.operationB > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText(calc.operationAText + Math.round(calc.operationB));
						} else {
							text.setText(calc.operationAText + calc.operationB);						}
					}
				} catch (Exception e) {
					calc.operationB = 0;
					text.setText("Number To Big");
				}
			}
		}
	}

	class fiveButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if (calc.aInUse) {
				try {
					calc.operationA = calc.operationA * 10 + 5;
					if (calc.operationA > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText("" + Math.round(calc.operationA));
						} else {
							text.setText("" + calc.operationA);
						}
					}
				} catch (Exception e) {
					calc.operationA = 0;
					text.setText("Number To Big");
				}
			} else {
				try {
					turnOffOperations();
					calc.operationB = calc.operationB * 10 + 5;
					if (calc.operationB > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText(calc.operationAText + Math.round(calc.operationB));
						} else {
							text.setText(calc.operationAText + calc.operationB);						}
					}
				} catch (Exception e) {
					calc.operationB = 0;
					text.setText("Number To Big");
				}
			}
		}
	}

	class sixButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if (calc.aInUse) {
				try {
					calc.operationA = calc.operationA * 10 + 6;
					if (calc.operationA > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText("" + Math.round(calc.operationA));
						} else {
							text.setText("" + calc.operationA);
						}
					}
				} catch (Exception e) {
					calc.operationA = 0;
					text.setText("Number To Big");
				}
			} else {
				try {
					turnOffOperations();
					calc.operationB = calc.operationB * 10 + 6;
					if (calc.operationB > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText(calc.operationAText + Math.round(calc.operationB));
						} else {
							text.setText(calc.operationAText + calc.operationB);						}
					}
				} catch (Exception e) {
					calc.operationB = 0;
					text.setText("Number To Big");
				}
			}
		}
	}

	class sevenButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if (calc.aInUse) {
				try {
					calc.operationA = calc.operationA * 10 + 7;
					if (calc.operationA > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText("" + Math.round(calc.operationA));
						} else {
							text.setText("" + calc.operationA);
						}
					}
				} catch (Exception e) {
					calc.operationA = 0;
					text.setText("Number To Big");
				}
			} else {
				try {
					turnOffOperations();
					calc.operationB = calc.operationB * 10 + 7;
					if (calc.operationB > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText(calc.operationAText + Math.round(calc.operationB));
						} else {
							text.setText(calc.operationAText + calc.operationB);						}
					}
				} catch (Exception e) {
					calc.operationB = 0;
					text.setText("Number To Big");
				}
			}
		}
	}

	class eightButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if (calc.aInUse) {
				try {
					calc.operationA = calc.operationA * 10 + 8;
					if (calc.operationA > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText("" + Math.round(calc.operationA));
						} else {
							text.setText(calc.operationAText + calc.operationB);						}
					}
				} catch (Exception e) {
					calc.operationA = 0;
					text.setText("Number To Big");
				}
			} else {
				try {
					turnOffOperations();
					calc.operationB = calc.operationB * 10 + 8;
					if (calc.operationB > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText(calc.operationAText + Math.round(calc.operationB));
						} else {
							text.setText(calc.operationAText + calc.operationB);						}
					}
				} catch (Exception e) {
					calc.operationB = 0;
					text.setText("Number To Big");
				}
			}
		}
	}

	class nineButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if (calc.aInUse) {
				try {

					calc.operationA = calc.operationA * 10 + 9;
					if (calc.operationA > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText("" + Math.round(calc.operationA));
						} else {
							text.setText("" + calc.operationA);
						}
					}
				} catch (Exception e) {
					calc.operationA = 0;
					text.setText("Number To Big");
				}
			} else {
				turnOffOperations();
				try {
					calc.operationB = calc.operationB * 10 + 9;
					if (calc.operationB > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText(calc.operationAText + Math.round(calc.operationB));
						} else {
							text.setText(calc.operationAText + calc.operationB);						}
					}
				} catch (Exception e) {
					calc.operationB = 0;
					text.setText("Number To Big");
				}
			}
		}
	}

	class zeroButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if (calc.aInUse) {
				try {

					calc.operationA = calc.operationA * 10 + 0;
					if (calc.operationA > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText("" + Math.round(calc.operationA));
						} else {
							text.setText("" + calc.operationA);
						}
					}
				} catch (Exception e) {
					calc.operationA = 0;
					text.setText("Number To Big");
				}
			} else {
				turnOffOperations();
				try {
					calc.operationB = calc.operationB * 10 + 0;
					if (calc.operationB > 999999999) {
						text.setText("Number To Big");
					} else {
						if (calc.autoRoundOn) {
							text.setText(calc.operationAText + Math.round(calc.operationB));
						} else {
							text.setText(calc.operationAText + calc.operationB);
						}
					}
				} catch (Exception e) {
					calc.operationB = 0;
					text.setText("Number To Big");
				}
			}
		}
	}


	class plusButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if (calc.aInUse) {
				calc.aInUse = false;
				calc.bInUse = true;
				calc.operation = "+";
				text.setText(text.getText() + " " + calc.operation + " ");
				calc.operationAText = text.getText();
			} else if (calc.bInUse) {
				text.setText(getRidOfThatEvilPointZero(calc.operationA) + " + ");
				calc.operation = "+";
			} else {
				text.setText("Error");
			}
		}
	}

	class minButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if (calc.aInUse) {
				calc.aInUse = false;
				calc.bInUse = true;
				calc.operation = "-";
				text.setText(text.getText() + " " + calc.operation + " ");
				calc.operationAText = text.getText();
			} else if (calc.bInUse) {
				text.setText(getRidOfThatEvilPointZero(calc.operationA) + " - ");
				calc.operation = "-";
			} else {
				text.setText("Error");
			}
		}
	}

	class equalsButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			try {
				if (calc.operation == "+") {
					calc.operationA = calc.operationA + calc.operationB;
				} else if (calc.operation == "-") {
					calc.operationA = calc.operationA - calc.operationB;
				} else if (calc.operation == "x") {
					calc.operationA = calc.operationA * calc.operationB;
				} else if (calc.operation == "/") {
					if (calc.operationB == 0) {
						text.setText("Can't divide by zero");
					} else {
						calc.operationA = calc.operationA / calc.operationB;
					}
				}
				try {
					if (!(calc.operationB == 0)) {
						text.setText("" + getRidOfThatEvilPointZero(calc.operationA));
					}
				} catch (Exception e) {
					calc.operationA = 0;
				}
				calc.aInUse = true;
				calc.operationB = 0;
				calc.bInUse = false;
				calc.operation = "";
				min.setEnabled(true);
				times.setEnabled(true);
				plus.setEnabled(true);
				divide.setEnabled(true);
			} catch (Exception e) {
				text.setText("Error");
				min.setEnabled(true);
				times.setEnabled(true);
				plus.setEnabled(true);
				divide.setEnabled(true);
			}
		}
	}

	class timesButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if (calc.aInUse) {
				calc.aInUse = false;
				calc.bInUse = true;
				calc.operation = "x";
				text.setText(text.getText() + " " + calc.operation + " ");
				calc.operationAText = text.getText();
			} else if (calc.bInUse) {
				text.setText(getRidOfThatEvilPointZero(calc.operationA) + " x ");
				calc.operation = "x";
			} else {
				text.setText("Error");
			}
		}
	}

	class divideButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			if (calc.aInUse) {
				calc.aInUse = false;
				calc.bInUse = true;
				calc.operation = "/";
				text.setText(text.getText() + " " + calc.operation + " ");
				calc.operationAText = text.getText();
			} else if (calc.bInUse) {
				text.setText(getRidOfThatEvilPointZero(calc.operationA) + " / ");
				calc.operation = "/";
			} else {
				text.setText("Error");
			}
		}
	}

	class clearButtonClicked implements ActionListener {
		public void actionPerformed(ActionEvent a) {
			text.setText("");
			calc.operationA = 0;
			calc.aInUse = true;
			calc.operationB = 0;
			calc.bInUse = false;
			calc.operation = "";
			min.setEnabled(true);
			times.setEnabled(true);
			plus.setEnabled(true);
			divide.setEnabled(true);
		}
	}

	private GridBagConstraints getConstraints(int x, int y) {
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.LINE_START;
		c.insets = new Insets(5, 5, 0, 5);
		c.gridx = x;
		c.gridy = y;
		return c;
	}

	public String getRidOfThatEvilPointZero(double x) {
		String strX = x + "";
		String str = "";
		try {
			str = strX.substring(strX.length() - 2, strX.length());
			if (str.equals(".0")) {
				return strX.substring(0, strX.length() - 2);
			}
			return strX;
		} catch (Exception e) {
			return strX;
		}

	}

	public void turnOffOperations() {
		if (min.isEnabled()) {
			min.setEnabled(false);
			times.setEnabled(false);
			plus.setEnabled(false);
			divide.setEnabled(false);
		}

	}
}
