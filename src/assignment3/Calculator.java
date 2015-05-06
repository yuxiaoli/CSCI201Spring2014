package assignment3;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator extends JFrame {
	public Calculator() {
		super("Calculator");
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		JButton invButton = new JButton("Inv");
		gbc.gridx = 0;
		gbc.gridy = 0;
		southPanel.add(invButton, gbc);
		
		JButton lnButton = new JButton("ln");
		gbc.gridx = 1;
		gbc.gridy = 0;
		southPanel.add(lnButton, gbc);
		
		JButton leftParenthesisButton = new JButton("(");
		gbc.gridx = 2;
		gbc.gridy = 0;
		southPanel.add(leftParenthesisButton, gbc);
		
		JButton rightParenthesisButton = new JButton(")");
		gbc.gridx = 3;
		gbc.gridy = 0;
		southPanel.add(rightParenthesisButton, gbc);
		
		JButton deleteButton = new JButton("del");
		gbc.gridx = 4;
		gbc.gridy = 0;
		southPanel.add(deleteButton, gbc);
		
		JButton clearAllButton = new JButton("CE");
		gbc.gridx = 5;
		gbc.gridy = 0;
		southPanel.add(clearAllButton, gbc);
		
		JButton clearButton = new JButton("C");
		gbc.gridx = 6;
		gbc.gridy = 0;
		southPanel.add(clearButton, gbc);
		
		JButton negateButton = new JButton("±");
		gbc.gridx = 7;
		gbc.gridy = 0;
		southPanel.add(negateButton, gbc);
		
		JButton squareRootButton = new JButton("√");
		gbc.gridx = 8;
		gbc.gridy = 0;
		southPanel.add(squareRootButton, gbc);
		
		
		JButton sinhButton = new JButton("sinh");
		gbc.gridx = 0;
		gbc.gridy = 1;
		southPanel.add(sinhButton, gbc);
		
		JButton sinButton = new JButton("sin");
		gbc.gridx = 1;
		gbc.gridy = 1;
		southPanel.add(sinButton, gbc);
		
		JButton squareButton = new JButton("x^2");
		gbc.gridx = 2;
		gbc.gridy = 1;
		southPanel.add(squareButton, gbc);
		
		JButton factorialButton = new JButton("n!");
		gbc.gridx = 3;
		gbc.gridy = 1;
		southPanel.add(factorialButton, gbc);
		
		JButton numSevenButton = new JButton("7");
		gbc.gridx = 4;
		gbc.gridy = 1;
		southPanel.add(numSevenButton, gbc);
		
		JButton numEightButton = new JButton("8");
		gbc.gridx = 5;
		gbc.gridy = 1;
		southPanel.add(numEightButton, gbc);
		
		JButton numNineButton = new JButton("9");
		gbc.gridx = 6;
		gbc.gridy = 1;
		southPanel.add(numNineButton, gbc);
		
		JButton devideButton = new JButton("/");
		gbc.gridx = 7;
		gbc.gridy = 1;
		southPanel.add(devideButton, gbc);
		
		JButton percentageButton = new JButton("%");
		gbc.gridx = 8;
		gbc.gridy = 1;
		southPanel.add(percentageButton, gbc);
		
		
		
		add(southPanel, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(400, 400);
		
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new Calculator();
	}
}
