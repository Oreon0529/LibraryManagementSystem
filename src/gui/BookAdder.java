package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class BookAdder extends JPanel {

	WindowFrame frame;

	
	public BookAdder(WindowFrame frame) {
		
		this.frame = frame;

		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new  JLabel("User ID:", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelTitle = new JLabel("Title:", JLabel.TRAILING);
        JTextField fieldTitle = new JTextField(10);
        labelTitle.setLabelFor(fieldTitle);
        panel.add(labelTitle);
        panel.add(fieldTitle);
		
		   JLabel labelBookId = new JLabel("Book Id:", JLabel.TRAILING);
	        JTextField fieldBookId = new JTextField(10);
	        labelBookId.setLabelFor(fieldBookId);
	        panel.add(labelBookId);
	        panel.add(fieldBookId);
		

		 JLabel labelDate = new JLabel("Lending Date:", JLabel.TRAILING);
	        JTextField fieldDate = new JTextField(10);
	        labelDate.setLabelFor(fieldDate);
	        panel.add(labelDate);
	        panel.add(fieldDate);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
	
}