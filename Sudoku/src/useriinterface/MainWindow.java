package useriinterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class MainWindow extends JFrame {
    public MainWindow() {
	super("SUDOKU");
	setLayout(new BorderLayout());
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(750, 750);
	
	JPanel smallGameBoard = new SmallGameBoard();
	add(smallGameBoard, BorderLayout.CENTER);
	pack();
	setLocationRelativeTo(null);
	setVisible(true);
    }

    public static void main(String[] args) {
	try{
	    
	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	}catch (Exception ex){
	    
	    ex.printStackTrace();
	}
	new MainWindow();

    }

}
