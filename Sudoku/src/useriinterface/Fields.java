package useriinterface;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;

public class Fields extends JLabel {
    private int x;
    private int y;
    private int number;
    Fields fields;

    public Fields(int x, int y) {
	super("", CENTER);
	setPreferredSize(new Dimension(25, 2));
	this.x = x;
	this.y = y;
    }

    public int getVarX() {
	return x;
    }

    public void setNumber(int number, boolean userInput) {
	setForeground(userInput ? Color.RED : Color.BLUE);
	setText(number > 0 ? number + "" : "");
	this.number = number;
    }

    public int getVarY() {
	return y;
    }

}
