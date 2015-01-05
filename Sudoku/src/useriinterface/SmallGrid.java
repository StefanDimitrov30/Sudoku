package useriinterface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class SmallGrid extends JPanel {
    private static final int Fields = 3;
    private JPanel[][] miniPanel;
    private Field [][]fields;
    

    public SmallGrid() {
	super(new GridLayout(3,3));
	this.miniPanel = new JPanel[Fields][Fields];
	for (int y = 0; y < miniPanel.length; y++) {
	    for (int x = 0; x < miniPanel.length;x++) {
		miniPanel[y][x] = new JPanel(new GridLayout(3, 3));
		miniPanel[y][x].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		add(miniPanel[y][x]);
	    }
	}
	this.fields = new Field[9][9];
	for (int y = 0; y < fields.length; y++) {
	    for (int x = 0; x < fields.length; x++) {
		fields[y][x] = new Field(9, 9);
		miniPanel[y/3][x/3].add(fields[y][x]);
		
	    }
	}
    }

}
