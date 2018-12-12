import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 * Table GUI for FreeCell
 * @author Mikael Hinton & Brian Belcher
 *
 */
public class Table_GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void TableScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table_GUI frame = new Table_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Table_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnReset = new JButton("New Game");
		btnReset.setBounds(473, 97, 113, 25);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.setLayout(null);
		
		JButton btnGameRules = new JButton("Game Rules");
		btnGameRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				GameRules_GUI.GameRulesScreen();
			}
		});
		btnGameRules.setBounds(473, 13, 113, 25);
		contentPane.add(btnGameRules);
		contentPane.add(btnReset);
		
		JPanel Freecell1 = new JPanel();
		Freecell1.setBorder(new LineBorder(new Color(0, 153, 255), 3));
		Freecell1.setBackground(new Color(204, 204, 204));
		Freecell1.setBounds(12, 13, 104, 150);
		contentPane.add(Freecell1);
		
		JPanel Freecell2 = new JPanel();
		Freecell2.setBorder(new LineBorder(new Color(0, 153, 255), 3));
		Freecell2.setBackground(new Color(204, 204, 204));
		Freecell2.setBounds(128, 13, 104, 150);
		contentPane.add(Freecell2);
		
		
		JPanel Freecell3 = new JPanel();
		Freecell3.setBorder(new LineBorder(new Color(0, 153, 255), 3));
		Freecell3.setBackground(new Color(204, 204, 204));
		Freecell3.setBounds(244, 13, 104, 150);
		contentPane.add(Freecell3);
		
		JPanel Freecell4 = new JPanel();
		Freecell4.setBorder(new LineBorder(new Color(0, 153, 255), 3));
		Freecell4.setBackground(new Color(204, 204, 204));
		Freecell4.setBounds(357, 13, 104, 150);
		contentPane.add(Freecell4);
		
		JPanel Hearts = new JPanel();
		Hearts.setBorder(new LineBorder(new Color(0, 204, 153), 3));
		Hearts.setBackground(new Color(204, 204, 204));
		Hearts.setBounds(598, 13, 104, 150);
		contentPane.add(Hearts);
		
		JLabel lblHearts = new JLabel("Hearts");
		Hearts.add(lblHearts);
		
		JPanel Clubs = new JPanel();
		Clubs.setBorder(new LineBorder(new Color(0, 204, 153), 3));
		Clubs.setBackground(new Color(204, 204, 204));
		Clubs.setBounds(714, 13, 104, 150);
		contentPane.add(Clubs);
		
		JLabel lblClubs = new JLabel("Clubs");
		Clubs.add(lblClubs);
		
		JPanel Diamonds = new JPanel();
		Diamonds.setBorder(new LineBorder(new Color(0, 204, 153), 3));
		Diamonds.setBackground(new Color(204, 204, 204));
		Diamonds.setBounds(830, 13, 104, 150);
		contentPane.add(Diamonds);
		
		JLabel lblDiamonds = new JLabel("Diamonds");
		Diamonds.add(lblDiamonds);
		
		JPanel Spades = new JPanel();
		Spades.setBorder(new LineBorder(new Color(0, 204, 153), 3));
		Spades.setBackground(new Color(204, 204, 204));
		Spades.setBounds(946, 13, 104, 150);
		contentPane.add(Spades);
		
		JLabel lblSpades = new JLabel("Spades");
		Spades.add(lblSpades);
		
		JPanel Tableau = new JPanel();
		Tableau.setBorder(new LineBorder(new Color(0, 204, 153), 3));
		Tableau.setBackground(new Color(0, 153, 255));
		Tableau.setBounds(12, 174, 1038, 486);
		contentPane.add(Tableau);
		Tableau.setLayout(null);
		
		JPanel Column1 = new JPanel();
		Column1.setBorder(new LineBorder(new Color(0, 204, 153), 3));
		Column1.setBackground(new Color(0, 153, 255));
		Column1.setBounds(58, 13, 104, 150);
		Tableau.add(Column1);
		
		JPanel Column2 = new JPanel();
		Column2.setBorder(new LineBorder(new Color(0, 204, 153), 3));
		Column2.setBackground(new Color(0, 153, 255));
		Column2.setBounds(174, 13, 104, 150);
		Tableau.add(Column2);
		
		JPanel Column3 = new JPanel();
		Column3.setBorder(new LineBorder(new Color(0, 204, 153), 3));
		Column3.setBackground(new Color(0, 153, 255));
		Column3.setBounds(290, 13, 104, 150);
		Tableau.add(Column3);
		
		JPanel Column4 = new JPanel();
		Column4.setBorder(new LineBorder(new Color(0, 204, 153), 3));
		Column4.setBackground(new Color(0, 153, 255));
		Column4.setBounds(406, 13, 104, 150);
		Tableau.add(Column4);
		
		JPanel Column5 = new JPanel();
		Column5.setBorder(new LineBorder(new Color(0, 204, 153), 3));
		Column5.setBackground(new Color(0, 153, 255));
		Column5.setBounds(529, 13, 104, 150);
		Tableau.add(Column5);
		
		JPanel Column6 = new JPanel();
		Column6.setBorder(new LineBorder(new Color(0, 204, 153), 3));
		Column6.setBackground(new Color(0, 153, 255));
		Column6.setBounds(645, 13, 104, 150);
		Tableau.add(Column6);
		
		JPanel Column7 = new JPanel();
		Column7.setBorder(new LineBorder(new Color(0, 204, 153), 3));
		Column7.setBackground(new Color(0, 153, 255));
		Column7.setBounds(761, 13, 104, 150);
		Tableau.add(Column7);
		
		JPanel Column8 = new JPanel();
		Column8.setBorder(new LineBorder(new Color(0, 204, 153), 3));
		Column8.setBackground(new Color(0, 153, 255));
		Column8.setBounds(877, 13, 104, 150);
		Tableau.add(Column8);
		
		JButton button = new JButton("Reset Game");
		button.setBounds(473, 135, 113, 25);
		contentPane.add(button);
	}
}
