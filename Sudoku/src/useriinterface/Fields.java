package useriinterface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Fields extends JLabel {
    private int x;
    private int y;
    private int number;
    Fields fields;
/**
 * 
 * @param x
 * @param y
 */
    public Fields(int x, int y) {
	super("", CENTER);
	setPreferredSize(new Dimension(25, 25));
	setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
	setFont(new Font(Font.DIALOG, Font.PLAIN, 18));
	setOpaque(true);
	this.x = x;
	this.y = y;
    }

    public int getVarX() {
	return x;
    }

    public void setNumber(int number, boolean userInput) {
	setForeground(userInput ? Color.RED : Color.BLUE);
	setText(number > 0 ? number + "" : "");
	
    }

    public int getVarY() {
	return y;
    }

}
