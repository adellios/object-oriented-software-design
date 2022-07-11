import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;


public class Driver
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Button Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(100, 100));

		JLabel label = new JLabel();
		mainPanel.add(label);

		JTextField answerField = new JTextField();
		answerField.setPreferredSize(new Dimension(30, 30));
		mainPanel.add(answerField);

		JButton button = new JButton("Submit");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				label.setText("You entered: " + answerField.getText());
				button.setEnabled(false);
				answerField.setEnabled(false);
			}
		});

		mainPanel.add(button);

		frame.add(mainPanel);
		frame.pack();
		frame.setVisible(true);
	}
}