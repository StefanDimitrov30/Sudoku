package useriinterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {
    /**
	 * 
	 */
    private static final long serialVersionUID = 2521905002476170344L;

    public static void main(String[] args) {
	JFrame sudoku = new JFrame("SUDOKU");
	sudoku.setLayout(new BorderLayout());
	sudoku.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JPanel buttonPane = new ButtoPanel();
	JPanel gamePanel = new JPanel(new GridLayout(3, 3));
	
	JPanel panel = null;
	for (int i = 0; i < 9; i++) {
	    panel = new SmallGrid();
	    gamePanel.add(panel);
	}
	
	sudoku.add(buttonPane,BorderLayout.SOUTH);
	sudoku.add(gamePanel);

	sudoku.setSize(750, 750);
	sudoku.setVisible(true);

    }

}
