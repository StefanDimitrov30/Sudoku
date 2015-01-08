package useriinterface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class SmallGameBoard extends JPanel {
    private JPanel[][] miniPanel;
    private Fields[][] fields;

    public SmallGameBoard() {
	super(new GridLayout(3, 3));
	this.miniPanel = new JPanel[3][3];
	for (int y = 0; y < miniPanel.length; y++) {
	    for (int x = 0; x < miniPanel.length; x++) {
		miniPanel[y][x] = new JPanel(new GridLayout(3, 3));
		miniPanel[y][x].setBorder(BorderFactory.createLineBorder(Color.GRAY));		
		miniPanel[y][x].setPreferredSize(new Dimension(25, 25));
		add(miniPanel[y][x]);
	    }
	}
	this.fields = new Fields[9][9];
	for (int y = 0; y < fields.length; y++) {
	    for (int x = 0; x < fields.length; x++) {
		fields[y][x] = new Fields(25, 25);
		miniPanel[y / 3][x / 3].add(fields[y][x]);

	    }
	}

    }

}
