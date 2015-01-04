package useriinterface;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2521905002476170344L;

	public static void main(String[] args) {
		JFrame sudoku = new JFrame("SUDOKU");
		sudoku.setSize(650, 650);
		sudoku.setLayout(new GridLayout(3,3));
		sudoku.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel miniPanel = new SmallGrid();
		sudoku.add(miniPanel);
		
		
		sudoku.setVisible(true);
		
	}

}
