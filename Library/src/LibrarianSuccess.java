import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LibrarianSuccess extends JFrame {
	static LibrarianSuccess frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LibrarianSuccess();
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
	public LibrarianSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 762);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLibrarianSection = new JLabel("Librarian Section");
		lblLibrarianSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibrarianSection.setForeground(Color.DARK_GRAY);
		lblLibrarianSection.setFont(new Font("Tahoma", Font.BOLD, 35));
		
		JButton btnNewButton = new JButton("Add Books");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BooksEntry.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 25));
		
		JButton btnViewBooks = new JButton("View Books");
		btnViewBooks.setForeground(Color.DARK_GRAY);
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewBooks.main(new String[]{});
			}
		});
		btnViewBooks.setFont(new Font("Cambria", Font.BOLD, 25));
		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.setForeground(Color.DARK_GRAY);
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBookForm.main(new String[]{});
				frame.dispose();
			}
		});
		btnIssueBook.setFont(new Font("Cambria", Font.BOLD, 25));
		
		JButton btnViewIssuedBooks = new JButton("View Current Issued Books");
		btnViewIssuedBooks.setForeground(Color.DARK_GRAY);
		btnViewIssuedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewIssuedBooks.main(new String[]{});
			}
		});
		btnViewIssuedBooks.setFont(new Font("Cambria", Font.BOLD, 25));
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.setForeground(Color.DARK_GRAY);
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnBook.main(new String[]{});
				frame.dispose();
			}
		});
		btnReturnBook.setFont(new Font("Cambria", Font.BOLD, 25));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setForeground(new Color(255, 0, 0));
		btnLogout.setBackground(Color.PINK);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Library.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Cambria", Font.BOLD, 25));
		
		JButton btnViewIssuedHistory = new JButton("View Issued Books History");
		btnViewIssuedHistory.setForeground(Color.DARK_GRAY);
		btnViewIssuedHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewIssuedHistory.main(new String[]{});
			}
		});
		btnViewIssuedHistory.setFont(new Font("Cambria", Font.BOLD, 25));
		
		JButton btnViewIssuedBooks_2_1 = new JButton("Search Books");
		btnViewIssuedBooks_2_1.setForeground(Color.DARK_GRAY);
		btnViewIssuedBooks_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BooksSearch.main(new String[]{});
				frame.dispose();
			}
		});
		btnViewIssuedBooks_2_1.setFont(new Font("Cambria", Font.BOLD, 25));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(95)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblLibrarianSection, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnReturnBook, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnViewIssuedBooks_2_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnViewIssuedHistory, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnViewIssuedBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnIssueBook, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnViewBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
						.addComponent(btnLogout, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(91, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(lblLibrarianSection)
					.addGap(45)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnViewIssuedBooks, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnViewIssuedHistory, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnViewIssuedBooks_2_1, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnReturnBook, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(47))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
