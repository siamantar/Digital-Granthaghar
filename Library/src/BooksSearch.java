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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.SystemColor;
public class BooksSearch extends JFrame {
	static BooksSearch frame;
	private JPanel contentPane;
	private JTextField textField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new BooksSearch();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	
	public BooksSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 836);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLibrarianSection = new JLabel("Books Search");
		lblLibrarianSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibrarianSection.setForeground(Color.DARK_GRAY);
		lblLibrarianSection.setFont(new Font("Tahoma", Font.BOLD, 35));
		
		JButton btnName = new JButton("Search by Title");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String searchKey=textField.getText();
				String sql = "Title LIKE '%"+searchKey+"%'";
				BooksSearchTitle.main(new String[]{});
				BooksSearchTitle.sbName(sql);
				//frame.dispose();
				//System.out.println(sql);
			
			}
		});
		btnName.setFont(new Font("Cambria", Font.BOLD, 24));
		
		JButton btnAuthor = new JButton("Search by Author");
		btnAuthor.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
				
				String searchKey=textField.getText();
				String sql = "Author LIKE '%"+searchKey+"%'";
				BooksSearchAuthor.main(new String[]{});
				BooksSearchAuthor.sbName(sql);
				//frame.dispose();
				//System.out.println(sql);
			
			}
			
		});
		btnAuthor.setFont(new Font("Cambria", Font.BOLD, 24));
		
		JButton btnISBN = new JButton("Search by ISBN");
		btnISBN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchKey=textField.getText();
				String sql = "ISBN LIKE '%"+searchKey+"%'";
				BooksSearchISBN.main(new String[]{});
				BooksSearchISBN.sbName(sql);
				//frame.dispose();
				//System.out.println(sql);
			}
		});
		btnISBN.setFont(new Font("Cambria", Font.BOLD, 24));
		
		JButton btnPubYear = new JButton("Search by Publication Year");
		btnPubYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchKey=textField.getText();
				String sql = "PublicationYear LIKE '%"+searchKey+"%'";
				BooksSearchPubYear.main(new String[]{});
				BooksSearchPubYear.sbName(sql);
				//frame.dispose();
				//System.out.println(sql);
			}
		});
		btnPubYear.setFont(new Font("Cambria", Font.BOLD, 24));
		
	
		JButton btnPublisher = new JButton("Search by Publisher");
		btnPublisher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchKey=textField.getText();
				String sql = "Publisher LIKE '%"+searchKey+"%'";
				BooksSearchPublisher.main(new String[]{});
				BooksSearchPublisher.sbName(sql);
				//frame.dispose();
				//System.out.println(sql);
			}
		});
		btnPublisher.setFont(new Font("Cambria", Font.BOLD, 24));
		
		JButton btnLogout = new JButton("Back");
		btnLogout.setForeground(Color.RED);
		btnLogout.setBackground(new Color(255, 192, 203));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Cambria", Font.PLAIN, 25));
		
		JButton btnSubject = new JButton("Search by Subjects");
		btnSubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchKey=textField.getText();
				String sql = "Subjects LIKE '%"+searchKey+"%'";
				BooksSearchSubject.main(new String[]{});
				BooksSearchSubject.sbName(sql);
				//frame.dispose();
				//System.out.println(sql);
			}
		});
		
		btnSubject.setFont(new Font("Cambria", Font.BOLD, 24));
		
		JButton btnBibNumber = new JButton("Search by Bib Number");
		btnBibNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchKey=textField.getText();
				String sql = "BibNum LIKE '%"+searchKey+"%'";
				BooksSearchBibNum.main(new String[]{});
				BooksSearchBibNum.sbName(sql);
				//frame.dispose();
				//System.out.println(sql);	
				}
		});
		btnBibNumber.setFont(new Font("Cambria", Font.BOLD, 24));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setToolTipText("");
		textField.setColumns(10);
		
		
		
		
		
		
		
		
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
						.addComponent(lblLibrarianSection, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(206)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnBibNumber, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
								.addComponent(btnAuthor, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
								.addComponent(btnName, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
								.addComponent(btnISBN, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
								.addComponent(btnPubYear, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
								.addComponent(btnSubject, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(btnLogout, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnPublisher, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)))
							.addGap(179)))
					.addGap(63))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addComponent(lblLibrarianSection)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(15)
					.addComponent(btnName, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnAuthor, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(btnISBN, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnPubYear, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnSubject, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnBibNumber, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnPublisher, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(36, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
