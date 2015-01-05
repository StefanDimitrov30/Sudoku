package useriinterface;

import java.awt.Dimension;

import javax.swing.JLabel;

public class Field extends JLabel {
    private int x;
    private int y;
    Field fields;


    public Field(int x,int y) {
    super("", CENTER);
    fields.setPreferredSize(new Dimension(25,25));

	this.x = x;
	this.y = y;

    }

    public int getX() {
	return x;
    }

    protected void setX(int x) {
	this.x = x;
    }

    public int getY() {
	return y;
    }

   

}
