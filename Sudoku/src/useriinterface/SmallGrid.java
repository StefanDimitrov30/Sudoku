package useriinterface;

import java.awt.Color;
import java.awt.GridLayout;
import java.lang.reflect.Field;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class SmallGrid extends JPanel {
	
	private static final int Fields = 3;

	private JPanel[][] miniPanel;
	private Field [][] field;
	

	public SmallGrid() {

		this.miniPanel = new JPanel[Fields][Fields];

		for (int x = 0; x < miniPanel.length; x++) {
			for (int y = 0; y < miniPanel.length; y++) {
				miniPanel[x][y] = new JPanel(new GridLayout(3, 3));
				miniPanel[x][y].setBorder(BorderFactory
						.createLineBorder(Color.BLACK));

				add(miniPanel[x][y]);

			}

		}

	}

}
