import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Library extends JFrame {
	static Library frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame= new Library();
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
	public Library() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 763);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLibraryManagement = new JLabel("E-GRANTHAGAR");
		lblLibraryManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibraryManagement.setFont(new Font("Myanmar Text", Font.BOLD, 60));
		lblLibraryManagement.setForeground(Color.LIGHT_GRAY);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setBackground(Color.WHITE);
		btnAdminLogin.setForeground(Color.DARK_GRAY);
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				frame.dispose();
			}
		});
		btnAdminLogin.setFont(new Font("Cambria", Font.BOLD, 40));
		
		JButton btnLibrarianLogin = new JButton("Librarian Login");
		btnLibrarianLogin.setBackground(Color.WHITE);
		btnLibrarianLogin.setForeground(Color.DARK_GRAY);
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibrarianLogin.main(new String[]{});
				setVisible(false);
			}
		});
		btnLibrarianLogin.setFont(new Font("Cambria", Font.BOLD, 40));
		
		JLabel lblNewLabel = new JLabel("Copyright @2021");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lblNewLabel.setForeground(Color.GRAY);
		
		JLabel lblNewLabel_1 = new JLabel("A Complete Digital Library Management System");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 33));
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addComponent(lblLibraryManagement, GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
					.addGap(23))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
					.addGap(36))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(238, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnLibrarianLogin, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAdminLogin, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE))
					.addGap(232))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(83)
					.addComponent(lblLibraryManagement, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1)
					.addGap(76)
					.addComponent(btnAdminLogin, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(btnLibrarianLogin, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
					.addGap(104)
					.addComponent(lblNewLabel)
					.addGap(26))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
