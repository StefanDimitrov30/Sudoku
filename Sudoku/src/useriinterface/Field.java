package useriinterface;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;

public class Field extends JLabel {
    private int x;
    private int y;
    private int number;
    Field fields;

    public Field(int x, int y) {
	super("", CENTER);
	setPreferredSize(new Dimension(0, 0));
	this.x = x;
	this.y = y;
    }

    public int getX() {
	return x;
    }

    public void setNumber(int number, boolean userInput) {
	setForeground(userInput ? Color.RED : Color.BLUE);
	setText(number > 0 ? number + "" : "");
	this.number = number;
    }

    public int getY() {
	return y;
    }

}
