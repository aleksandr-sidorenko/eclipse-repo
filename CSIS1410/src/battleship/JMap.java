package battleship;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class JMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMap frame = new JMap();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
		MediaPlayer player = new MediaPlayer();
		player.Play();
	}

	/**
	 * Create the frame.
	 */
	public JMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 700, 1100, 800);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(10, 10));
		contentPane.setPreferredSize(new Dimension(10, 10));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setIcon(new ImageIcon(JMap.class.getResource("/Battleship.jpeg")));
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Start Game");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setPreferredSize(new Dimension(114, 40));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
	}
	
	

}
