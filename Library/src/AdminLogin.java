import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class AdminLogin extends JFrame {
	static AdminLogin frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 426);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdminLoginForm = new JLabel("Admin Login Panel");
		lblAdminLoginForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLoginForm.setForeground(Color.DARK_GRAY);
		lblAdminLoginForm.setFont(new Font("Tahoma", Font.BOLD, 35));
		
		JLabel lblEnterName = new JLabel("Enter Name:");
		lblEnterName.setForeground(Color.BLACK);
		lblEnterName.setFont(new Font("Cambria", Font.PLAIN, 24));
		
		JLabel lblEnterPassword = new JLabel("Enter Password:");
		lblEnterPassword.setForeground(Color.BLACK);
		lblEnterPassword.setFont(new Font("Cambria", Font.PLAIN, 24));
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria", Font.PLAIN, 24));
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.DARK_GRAY);
		btnLogin.setFont(new Font("Cambria", Font.BOLD, 24));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			String password=String.valueOf(passwordField.getPassword());
			if(name.equals("admin")&&password.equals("admin123")){
				AdminSuccess.main(new String[]{});
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				textField.setText("");
				passwordField.setText("");
			}
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Cambria", Font.PLAIN, 24));
		
		JButton btnLogin_1 = new JButton("Back");
		btnLogin_1.setForeground(Color.DARK_GRAY);
		btnLogin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Library.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogin_1.setFont(new Font("Cambria", Font.BOLD, 24));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addComponent(lblAdminLoginForm, GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
					.addGap(24))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(80)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEnterPassword)
								.addComponent(lblEnterName))
							.addGap(141)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(passwordField)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnLogin_1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(79, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addComponent(lblAdminLoginForm)
					.addGap(65)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEnterName))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEnterPassword))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

