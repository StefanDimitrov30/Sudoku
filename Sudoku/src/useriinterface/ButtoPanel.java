package useriinterface;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class ButtoPanel extends JPanel {
    private JButton [] buttons;
    private JPanel panel;

    public ButtoPanel() {
	super(new FlowLayout());
	this.buttons = new JButton[9];
	for (int i = 0; i < buttons.length; i++) {
	    buttons[i] = new JButton("9");

	    add(buttons[i]);
	    
	}
	add(new JButton("New"));
	add(new JButton("Check"));
    }

}
