import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JLabel;

/**
 * Welcome GUI for FreeCell
 * @author Mikael Hinton & Brian Belcher
 *
 */
public class Welcome_GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome_GUI frame = new Welcome_GUI();
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
	public Welcome_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		btnPlay.setBounds(222, 195, 258, 43);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Table_GUI.TableScreen();
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnPlay);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		rigidArea.setBounds(0, 0, 702, 433);
		contentPane.add(rigidArea);
		
		JLabel lblFreeCell = new JLabel("FREECELL");
		lblFreeCell.setHorizontalAlignment(SwingConstants.CENTER);
		lblFreeCell.setFont(new Font("Segoe Print", Font.BOLD, 64));
		lblFreeCell.setBounds(170, 114, 362, 81);
		contentPane.add(lblFreeCell);
		
		JLabel lblNewLabel = new JLabel("Welcome to");
		lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(170, 94, 362, 16);
		contentPane.add(lblNewLabel);
	}
}
