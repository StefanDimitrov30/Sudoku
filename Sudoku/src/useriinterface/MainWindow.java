package useriinterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
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
		sudoku.setLayout(new FlowLayout());
		sudoku.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new GridLayout(3, 3));
		panel.setBackground(Color.BLUE);
		JPanel grid = new SmallGrid();
		panel.add(grid);
		sudoku.add(panel);

		sudoku.setVisible(true);

	}

}
