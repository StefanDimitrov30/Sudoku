package useriinterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;

public class Sudoku {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sudoku window = new Sudoku();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sudoku() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(650, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(3, 3));

		JPanel panelRow1 = new JPanel();
		frame.getContentPane().add(panelRow1);
		panelRow1.setLayout(new GridLayout(3, 3));

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 1, 1, (Color) new Color(0, 0, 0)));

		panelRow1.add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));

		panelRow1.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panelRow1.add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));

		panelRow1.add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));

		panelRow1.add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(1, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panelRow1.add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 3, 2, 1, (Color) new Color(0, 0, 0)));
		panelRow1.add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new MatteBorder(1, 1, 2, 1, (Color) new Color(0, 0, 0)));
		panelRow1.add(panel_7);
		panel_7.setLayout(new CardLayout(0, 0));

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		panelRow1.add(panel_8);
		panel_8.setLayout(new CardLayout(0, 0));

		JPanel panel1Row1 = new JPanel();
		frame.getContentPane().add(panel1Row1);
		panel1Row1.setLayout(new GridLayout(3, 3));

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel1Row1.add(panel_9);
		panel_9.setLayout(new CardLayout(0, 0));

		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel1Row1.add(panel_10);
		panel_10.setLayout(new CardLayout(0, 0));

		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new MatteBorder(3, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel1Row1.add(panel_11);
		panel_11.setLayout(new CardLayout(0, 0));

		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new MatteBorder(1, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel1Row1.add(panel_12);
		panel_12.setLayout(new CardLayout(0, 0));

		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel1Row1.add(panel_13);
		panel_13.setLayout(new CardLayout(0, 0));

		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new MatteBorder(1, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel1Row1.add(panel_14);
		panel_14.setLayout(new CardLayout(0, 0));

		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new MatteBorder(1, 2, 2, 1, (Color) new Color(0, 0, 0)));
		panel1Row1.add(panel_15);
		panel_15.setLayout(new CardLayout(0, 0));

		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new MatteBorder(1, 1, 2, 1, (Color) new Color(0, 0, 0)));
		panel1Row1.add(panel_16);
		panel_16.setLayout(new CardLayout(0, 0));

		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		panel1Row1.add(panel_17);
		panel_17.setLayout(new CardLayout(0, 0));

		JPanel panel2Row1 = new JPanel();

		frame.getContentPane().add(panel2Row1);
		panel2Row1.setLayout(new GridLayout(3, 3));

		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel2Row1.add(panel_18);
		panel_18.setLayout(new CardLayout(0, 0));

		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new MatteBorder(3, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel2Row1.add(panel_19);
		panel_19.setLayout(new CardLayout(0, 0));

		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new MatteBorder(3, 1, 1, 3, (Color) new Color(0, 0, 0)));
		panel2Row1.add(panel_21);
		panel_21.setLayout(new CardLayout(0, 0));

		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new MatteBorder(1, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel2Row1.add(panel_20);
		panel_20.setLayout(new CardLayout(0, 0));

		JPanel panel_22 = new JPanel();
		panel_22.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel2Row1.add(panel_22);
		panel_22.setLayout(new CardLayout(0, 0));

		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
		panel2Row1.add(panel_23);
		panel_23.setLayout(new CardLayout(0, 0));

		JPanel panel_24 = new JPanel();
		panel_24.setBorder(new MatteBorder(1, 2, 2, 1, (Color) new Color(0, 0, 0)));
		panel2Row1.add(panel_24);
		panel_24.setLayout(new CardLayout(0, 0));

		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new MatteBorder(1, 1, 2, 1, (Color) new Color(0, 0, 0)));
		panel2Row1.add(panel_25);
		panel_25.setLayout(new CardLayout(0, 0));

		JPanel panel_26 = new JPanel();
		panel_26.setBorder(new MatteBorder(1, 1, 2, 3, (Color) new Color(0, 0, 0)));
		panel2Row1.add(panel_26);
		panel_26.setLayout(new CardLayout(0, 0));

		JPanel panelRow2 = new JPanel();
		frame.getContentPane().add(panelRow2);
		panelRow2.setLayout(new GridLayout(3, 3));

		JPanel panel_27 = new JPanel();
		panel_27.setBorder(new MatteBorder(2, 3, 1, 1, (Color) new Color(0, 0, 0)));
		panelRow2.add(panel_27);
		panel_27.setLayout(new CardLayout(0, 0));

		JPanel panel_28 = new JPanel();
		panel_28.setBorder(new MatteBorder(2, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelRow2.add(panel_28);
		panel_28.setLayout(new CardLayout(0, 0));

		JPanel panel_29 = new JPanel();
		panel_29.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panelRow2.add(panel_29);
		panel_29.setLayout(new CardLayout(0, 0));

		JPanel panel_30 = new JPanel();
		panel_30.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
		panelRow2.add(panel_30);
		panel_30.setLayout(new CardLayout(0, 0));

		JPanel panel_31 = new JPanel();
		panel_31.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelRow2.add(panel_31);
		panel_31.setLayout(new CardLayout(0, 0));

		JPanel panel_32 = new JPanel();
		panel_32.setBorder(new MatteBorder(1, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panelRow2.add(panel_32);
		panel_32.setLayout(new CardLayout(0, 0));

		JPanel panel_33 = new JPanel();
		panel_33.setBorder(new MatteBorder(1, 3, 2, 1, (Color) new Color(0, 0, 0)));
		panelRow2.add(panel_33);
		panel_33.setLayout(new CardLayout(0, 0));

		JPanel panel_34 = new JPanel();
		panel_34.setBorder(new MatteBorder(1, 1, 2, 1, (Color) new Color(0, 0, 0)));
		panelRow2.add(panel_34);
		panel_34.setLayout(new CardLayout(0, 0));

		JPanel panel_35 = new JPanel();
		panel_35.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		panelRow2.add(panel_35);
		panel_35.setLayout(new CardLayout(0, 0));

		JPanel panel1Row2 = new JPanel();
		frame.getContentPane().add(panel1Row2);
		panel1Row2.setLayout(new GridLayout(3, 3));

		JPanel panel_36 = new JPanel();
		panel_36.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel1Row2.add(panel_36);
		panel_36.setLayout(new CardLayout(0, 0));

		JPanel panel_37 = new JPanel();
		panel_37.setBorder(new MatteBorder(2, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel1Row2.add(panel_37);
		panel_37.setLayout(new CardLayout(0, 0));

		JPanel panel_38 = new JPanel();
		panel_38.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel1Row2.add(panel_38);
		panel_38.setLayout(new CardLayout(0, 0));

		JPanel panel_39 = new JPanel();
		panel_39.setBorder(new MatteBorder(1, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel1Row2.add(panel_39);
		panel_39.setLayout(new CardLayout(0, 0));

		JPanel panel_40 = new JPanel();
		panel_40.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel1Row2.add(panel_40);
		panel_40.setLayout(new CardLayout(0, 0));

		JPanel panel_41 = new JPanel();
		panel_41.setBorder(new MatteBorder(1, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel1Row2.add(panel_41);
		panel_41.setLayout(new CardLayout(0, 0));

		JPanel panel_42 = new JPanel();
		panel_42.setBorder(new MatteBorder(1, 2, 2, 1, (Color) new Color(0, 0, 0)));
		panel1Row2.add(panel_42);
		panel_42.setLayout(new CardLayout(0, 0));

		JPanel panel_43 = new JPanel();
		panel_43.setBorder(new MatteBorder(1, 1, 2, 1, (Color) new Color(0, 0, 0)));
		panel1Row2.add(panel_43);
		panel_43.setLayout(new CardLayout(0, 0));

		JPanel panel_44 = new JPanel();
		panel_44.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		panel1Row2.add(panel_44);
		panel_44.setLayout(new CardLayout(0, 0));

		JPanel panel2Row2 = new JPanel();
		frame.getContentPane().add(panel2Row2);
		panel2Row2.setLayout(new GridLayout(3, 3));

		JPanel panel_45 = new JPanel();
		panel_45.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel2Row2.add(panel_45);
		panel_45.setLayout(new CardLayout(0, 0));

		JPanel panel_46 = new JPanel();
		panel_46.setBorder(new MatteBorder(2, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel2Row2.add(panel_46);
		panel_46.setLayout(new CardLayout(0, 0));

		JPanel panel_47 = new JPanel();
		panel_47.setBorder(new MatteBorder(2, 1, 1, 3, (Color) new Color(0, 0, 0)));
		panel2Row2.add(panel_47);
		panel_47.setLayout(new CardLayout(0, 0));

		JPanel panel_48 = new JPanel();
		panel_48.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel2Row2.add(panel_48);
		panel_48.setLayout(new CardLayout(0, 0));

		JPanel panel_49 = new JPanel();
		panel_49.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel2Row2.add(panel_49);
		panel_49.setLayout(new CardLayout(0, 0));

		JPanel panel_50 = new JPanel();
		panel_50.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
		panel2Row2.add(panel_50);
		panel_50.setLayout(new CardLayout(0, 0));

		JPanel panel_51 = new JPanel();
		panel_51.setBorder(new MatteBorder(1, 2, 2, 1, (Color) new Color(0, 0, 0)));
		panel2Row2.add(panel_51);
		panel_51.setLayout(new CardLayout(0, 0));

		JPanel panel_52 = new JPanel();
		panel_52.setBorder(new MatteBorder(1, 1, 2, 1, (Color) new Color(0, 0, 0)));
		panel2Row2.add(panel_52);
		panel_52.setLayout(new CardLayout(0, 0));

		JPanel panel_53 = new JPanel();
		panel_53.setBorder(new MatteBorder(1, 1, 2, 3, (Color) new Color(0, 0, 0)));
		panel2Row2.add(panel_53);
		panel_53.setLayout(new CardLayout(0, 0));

		JPanel panelRow3 = new JPanel();
		frame.getContentPane().add(panelRow3);
		panelRow3.setLayout(new GridLayout(3, 3));

		JPanel panel_54 = new JPanel();
		panel_54.setBorder(new MatteBorder(2, 3, 1, 1, (Color) new Color(0, 0, 0)));
		panelRow3.add(panel_54);
		panel_54.setLayout(new CardLayout(0, 0));

		JPanel panel_55 = new JPanel();
		panel_55.setBorder(new MatteBorder(2, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelRow3.add(panel_55);
		panel_55.setLayout(new CardLayout(0, 0));

		JPanel panel_56 = new JPanel();
		panel_56.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panelRow3.add(panel_56);
		panel_56.setLayout(new CardLayout(0, 0));

		JPanel panel_57 = new JPanel();
		panel_57.setBorder(new MatteBorder(1, 3, 1, 1, (Color) new Color(0, 0, 0)));
		panelRow3.add(panel_57);
		panel_57.setLayout(new CardLayout(0, 0));

		JPanel panel_58 = new JPanel();
		panel_58.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelRow3.add(panel_58);
		panel_58.setLayout(new CardLayout(0, 0));

		JPanel panel_59 = new JPanel();
		panel_59.setBorder(new MatteBorder(1, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panelRow3.add(panel_59);
		panel_59.setLayout(new CardLayout(0, 0));

		JPanel panel_60 = new JPanel();
		panel_60.setBorder(new MatteBorder(1, 3, 3, 1, (Color) new Color(0, 0, 0)));
		panelRow3.add(panel_60);
		panel_60.setLayout(new CardLayout(0, 0));

		JPanel panel_61 = new JPanel();
		panel_61.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
		panelRow3.add(panel_61);
		panel_61.setLayout(new CardLayout(0, 0));

		JPanel panel_62 = new JPanel();
		panel_62.setBorder(new MatteBorder(1, 1, 3, 2, (Color) new Color(0, 0, 0)));
		panelRow3.add(panel_62);
		panel_62.setLayout(new CardLayout(0, 0));

		JPanel panel1Row3 = new JPanel();
		frame.getContentPane().add(panel1Row3);
		panel1Row3.setLayout(new GridLayout(3, 3));

		JPanel panel_63 = new JPanel();
		panel_63.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel1Row3.add(panel_63);
		panel_63.setLayout(new CardLayout(0, 0));

		JPanel panel_64 = new JPanel();
		panel_64.setBorder(new MatteBorder(2, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel1Row3.add(panel_64);
		panel_64.setLayout(new CardLayout(0, 0));

		JPanel panel_65 = new JPanel();
		panel_65.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel1Row3.add(panel_65);
		panel_65.setLayout(new CardLayout(0, 0));

		JPanel panel_66 = new JPanel();
		panel_66.setBorder(new MatteBorder(1, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel1Row3.add(panel_66);
		panel_66.setLayout(new CardLayout(0, 0));

		JPanel panel_67 = new JPanel();
		panel_67.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel1Row3.add(panel_67);
		panel_67.setLayout(new CardLayout(0, 0));

		JPanel panel_68 = new JPanel();
		panel_68.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel1Row3.add(panel_68);
		panel_68.setLayout(new CardLayout(0, 0));

		JPanel panel_69 = new JPanel();
		panel_69.setBorder(new MatteBorder(1, 2, 3, 1, (Color) new Color(0, 0, 0)));
		panel1Row3.add(panel_69);
		panel_69.setLayout(new CardLayout(0, 0));

		JPanel panel_70 = new JPanel();
		panel_70.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
		panel1Row3.add(panel_70);
		panel_70.setLayout(new CardLayout(0, 0));

		JPanel panel_71 = new JPanel();
		panel_71.setBorder(new MatteBorder(1, 1, 3, 2, (Color) new Color(0, 0, 0)));
		panel1Row3.add(panel_71);
		panel_71.setLayout(new CardLayout(0, 0));

		JPanel panel2Row3 = new JPanel();
		frame.getContentPane().add(panel2Row3);
		panel2Row3.setLayout(new GridLayout(3, 3));

		JPanel panel_72 = new JPanel();
		panel_72.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel2Row3.add(panel_72);
		panel_72.setLayout(new CardLayout(0, 0));

		JPanel panel_73 = new JPanel();
		panel_73.setBorder(new MatteBorder(2, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel2Row3.add(panel_73);
		panel_73.setLayout(new CardLayout(0, 0));

		JPanel panel_74 = new JPanel();
		panel_74.setBorder(new MatteBorder(2, 1, 1, 3, (Color) new Color(0, 0, 0)));
		panel2Row3.add(panel_74);
		panel_74.setLayout(new CardLayout(0, 0));

		JPanel panel_75 = new JPanel();
		panel_75.setBorder(new MatteBorder(1, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel2Row3.add(panel_75);
		panel_75.setLayout(new CardLayout(0, 0));

		JPanel panel_76 = new JPanel();
		panel_76.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel2Row3.add(panel_76);
		panel_76.setLayout(new CardLayout(0, 0));

		JPanel panel_77 = new JPanel();
		panel_77.setBorder(new MatteBorder(1, 1, 1, 3, (Color) new Color(0, 0, 0)));
		panel2Row3.add(panel_77);
		panel_77.setLayout(new CardLayout(0, 0));

		JPanel panel_78 = new JPanel();
		panel_78.setBorder(new MatteBorder(1, 2, 3, 1, (Color) new Color(0, 0, 0)));
		panel2Row3.add(panel_78);
		panel_78.setLayout(new CardLayout(0, 0));

		JPanel panel_79 = new JPanel();
		panel_79.setBorder(new MatteBorder(1, 1, 3, 1, (Color) new Color(0, 0, 0)));
		panel2Row3.add(panel_79);
		panel_79.setLayout(new CardLayout(0, 0));

		JPanel panel_80 = new JPanel();
		panel_80.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(0, 0, 0)));
		panel2Row3.add(panel_80);
		panel_80.setLayout(new CardLayout(0, 0));
	}

}
