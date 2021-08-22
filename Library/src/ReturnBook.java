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
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReturnBook extends JFrame {
	static ReturnBook frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ReturnBook();
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
	public ReturnBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblReturnBook = new JLabel("Return Book");
		lblReturnBook.setForeground(Color.GRAY);
		lblReturnBook.setFont(new Font("Tahoma", Font.BOLD, 35));
		
		JLabel lblBookCallno = new JLabel("Bib No:");
		lblBookCallno.setFont(new Font("Cambria", Font.PLAIN, 25));
		
		JLabel lblStudentId = new JLabel("Student ID:");
		lblStudentId.setFont(new Font("Cambria", Font.PLAIN, 25));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.setForeground(Color.DARK_GRAY);
		btnReturnBook.setFont(new Font("Cambria", Font.BOLD, 24));
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookcallno=textField.getText();
				int studentid=Integer.parseInt(textField_1.getText());
				int i=ReturnBookDao.delete(bookcallno, studentid);
				if(i>0){
					JOptionPane.showMessageDialog(ReturnBook.this,"Book returned successfully!");
					LibrarianSuccess.main(new String[]{});
					frame.dispose();
					
				}else{
					JOptionPane.showMessageDialog(ReturnBook.this,"Sorry, unable to return book!");
				}
			}
		});
		
		JLabel lblNewLabel = new JLabel("Note: Check the book properly!");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.DARK_GRAY);
		btnBack.setFont(new Font("Cambria", Font.BOLD, 24));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		
		JButton btnList = new JButton("List");
		btnList.setForeground(Color.DARK_GRAY);
		btnList.setFont(new Font("Cambria", Font.BOLD, 24));
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewIssuedBooks.main(new String[]{});
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(81)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(217)
											.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblStudentId)
												.addComponent(lblBookCallno, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
											.addGap(37)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
												.addComponent(textField_1)
												.addComponent(textField, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE))))
									.addGap(18)
									.addComponent(btnList, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblReturnBook)
									.addGap(200)))))
					.addContainerGap(89, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addComponent(lblReturnBook)
					.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBookCallno)
						.addComponent(btnList, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStudentId))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(55)
					.addComponent(lblNewLabel)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}
