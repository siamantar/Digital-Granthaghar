import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Component;

public class IssueBookForm extends JFrame {
	static IssueBookForm frame;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new IssueBookForm();
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
	public IssueBookForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Issue Book ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setForeground(Color.GRAY);
		
		JLabel lblBookName = new JLabel("Bib No  :");
		lblBookName.setFont(new Font("Cambria", Font.PLAIN, 25));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		
		JLabel lblStudentId = new JLabel("Student ID :");
		lblStudentId.setFont(new Font("Cambria", Font.PLAIN, 25));
		
		JLabel lblStudentName = new JLabel("Student Name:");
		lblStudentName.setFont(new Font("Cambria", Font.PLAIN, 25));
		
		JLabel lblStudentContact = new JLabel("Student Contact:");
		lblStudentContact.setFont(new Font("Cambria", Font.PLAIN, 25));
		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.setForeground(Color.DARK_GRAY);
		btnIssueBook.setFont(new Font("Cambria", Font.BOLD, 24));
		btnIssueBook.setMinimumSize(new Dimension(80, 23));
		btnIssueBook.setMaximumSize(new Dimension(80, 23));
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String bibNum=textField_1.getText();
			int studentid=Integer.parseInt(textField_2.getText());
			String studentname=textField_3.getText();
			String studentcontact=textField_4.getText();
			
			if(IssueBookDao.checkBook(bibNum)){
			
				int i=IssueBookDao.save(bibNum, studentid, studentname, studentcontact);
				if(i>0){
					JOptionPane.showMessageDialog(IssueBookForm.this,"Book issued successfully!");
					LibrarianSuccess.main(new String[]{});
					frame.dispose();
					
				}else{
					JOptionPane.showMessageDialog(IssueBookForm.this,"Sorry, unable to issue!");
				}//end of save if-else
				
			}else{
				JOptionPane.showMessageDialog(IssueBookForm.this,"Sorry, bibNum doesn't exist!");
			}//end of checkbook if-else
			
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.DARK_GRAY);
		btnBack.setFont(new Font("Cambria", Font.BOLD, 24));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("*Note: Please check Student ID carefully before issuing book!");
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.RED);
		
		JButton btnViewBooks = new JButton("List");
		btnViewBooks.setForeground(Color.DARK_GRAY);
		btnViewBooks.setFont(new Font("Cambria", Font.BOLD, 24));
		btnViewBooks.setMargin(new Insets(2, 2, 2, 2));
		btnViewBooks.setMinimumSize(new Dimension(49, 20));
		btnViewBooks.setMaximumSize(new Dimension(49, 20));
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewBooks.main(new String[]{});
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(51)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblStudentId, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
								.addComponent(lblStudentName, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
								.addComponent(lblStudentContact, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBookName, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
								.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
								.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
								.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))))
					.addGap(18)
					.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(53))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addContainerGap(339, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(323, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(307))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addComponent(lblNewLabel)
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBookName)
						.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStudentId))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStudentName))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStudentContact))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
