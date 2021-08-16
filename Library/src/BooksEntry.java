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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Dimension;

public class BooksEntry extends JFrame {
	static BooksEntry frame;
	private JPanel contentPane;
	private JTextField tfBibNum;
	private JTextField tfTitle;
	private JTextField tfAuthor;
	private JTextField tfISBN;
	private JTextField tfPublicationYear;
	private JTextField tfPublisher;
	private JTextField tfSubjects;
	private JTextField tfItemType;
	private JTextField tfItemCollection;
	private JTextField tfFloatingItem;
	private JTextField tfItemLocation;
	private JTextField tfQuantity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new BooksEntry();
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
	public BooksEntry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 888);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAddBooks_1 = new JLabel("Add Books");
		lblAddBooks_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAddBooks_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddBooks_1.setForeground(Color.GRAY);
		lblAddBooks_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		
		
		JLabel lblBibNum = new JLabel("Bib Number:");
		lblBibNum.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblBibNum.setMinimumSize(new Dimension(40, 15));
		lblBibNum.setMaximumSize(new Dimension(40, 15));
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblTitle.setMinimumSize(new Dimension(40, 15));
		lblTitle.setMaximumSize(new Dimension(40, 15));
		
		JLabel lblAuthor = new JLabel("Author:");
		lblAuthor.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblAuthor.setMinimumSize(new Dimension(40, 15));
		lblAuthor.setMaximumSize(new Dimension(40, 15));
		
		JLabel lblISBN = new JLabel("ISBN:");
		lblISBN.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblISBN.setMinimumSize(new Dimension(40, 15));
		lblISBN.setMaximumSize(new Dimension(40, 15));
		
		JLabel lblPublicationYear = new JLabel("Publication Year:");
		lblPublicationYear.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblPublicationYear.setMinimumSize(new Dimension(40, 15));
		lblPublicationYear.setMaximumSize(new Dimension(40, 15));
		
		JLabel lblPublisher = new JLabel("Publisher:");
		lblPublisher.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblPublisher.setMinimumSize(new Dimension(40, 15));
		lblPublisher.setMaximumSize(new Dimension(40, 15));
		
		JLabel lblSubjects = new JLabel("Subjects:");
		lblSubjects.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblSubjects.setMinimumSize(new Dimension(40, 15));
		lblSubjects.setMaximumSize(new Dimension(40, 15));
		
		JLabel lblItemType = new JLabel("Item Type:");
		lblItemType.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblItemType.setMinimumSize(new Dimension(40, 15));
		lblItemType.setMaximumSize(new Dimension(40, 15));
		
		JLabel lblItemCollection = new JLabel("Item Collection:");
		lblItemCollection.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblItemCollection.setMinimumSize(new Dimension(40, 15));
		lblItemCollection.setMaximumSize(new Dimension(40, 15));
		
		JLabel lblFloatingItem = new JLabel("Floating Item:");
		lblFloatingItem.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblFloatingItem.setMinimumSize(new Dimension(40, 15));
		lblFloatingItem.setMaximumSize(new Dimension(40, 15));
		
		JLabel lblItemLocation = new JLabel("Item Location:");
		lblItemLocation.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblItemLocation.setMinimumSize(new Dimension(40, 15));
		lblItemLocation.setMaximumSize(new Dimension(40, 15));
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblQuantity.setMinimumSize(new Dimension(40, 15));
		lblQuantity.setMaximumSize(new Dimension(40, 15));
		
		
		tfBibNum = new JTextField();
		tfBibNum.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfBibNum.setColumns(10);
		
		tfTitle = new JTextField();
		tfTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfTitle.setColumns(10);
		
		tfAuthor = new JTextField();
		tfAuthor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAuthor.setColumns(10);
		
		tfISBN = new JTextField();
		tfISBN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfISBN.setColumns(10);
		
		tfPublicationYear = new JTextField();
		tfPublicationYear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfPublicationYear.setColumns(10);
		
		tfPublisher = new JTextField();
		tfPublisher.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfPublisher.setColumns(10);
		
		tfSubjects = new JTextField();
		tfSubjects.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfSubjects.setColumns(10);
		
		tfItemType = new JTextField();
		tfItemType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfItemType.setColumns(10);
		
		tfItemCollection = new JTextField();
		tfItemCollection.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfItemCollection.setColumns(10);
		
		tfFloatingItem = new JTextField();
		tfFloatingItem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfFloatingItem.setColumns(10);
		
		tfItemLocation = new JTextField();
		tfItemLocation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfItemLocation.setColumns(10);
		
		tfQuantity = new JTextField();
		tfQuantity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfQuantity.setColumns(10);
		
		
		
		JButton btnAddBooks = new JButton("Add Books");
		btnAddBooks.setFont(new Font("Cambria", Font.BOLD, 24));
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String BibNum=tfBibNum.getText();
				
				//int BibNum=Integer.parseInt(sBibNum);
				String Title=tfTitle.getText();
				String Author=tfAuthor.getText();
				String ISBN=tfISBN.getText();
				String PublicationYear=tfPublicationYear.getText();
				
				String Publisher=tfPublisher.getText();
				String Subjects=tfSubjects.getText();
				String ItemType=tfItemType.getText();
				String ItemCollection=tfItemCollection.getText();
				String FloatingItem=tfFloatingItem.getText();
				String ItemLocation=tfItemLocation.getText();
				//String ReportDate=tfReportDate.getText();
				
				String squantity=tfQuantity.getText();
				
				int Quantity=Integer.parseInt(squantity);
				
				
				int i=BooksEntryAction.save(BibNum, Title, Author, ISBN, PublicationYear, Publisher, Subjects, ItemType, ItemCollection, FloatingItem, ItemLocation,  Quantity);
				if(i>0){
					JOptionPane.showMessageDialog(BooksEntry.this,"Books added successfully!");
					LibrarianSuccess.main(new String[]{});
					frame.dispose();
					
				}else{
					JOptionPane.showMessageDialog(BooksEntry.this,"Sorry, unable to save!");
				}
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Cambria", Font.BOLD, 24));
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
				
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(42)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblQuantity, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblFloatingItem, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblItemLocation, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblTitle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblAuthor, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblISBN, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblPublicationYear, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblPublisher, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblSubjects, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblItemType, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblItemCollection, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblBibNum, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(tfQuantity)
										.addComponent(tfItemLocation)
										.addComponent(tfFloatingItem)
										.addComponent(tfItemCollection)
										.addComponent(tfItemType)
										.addComponent(tfSubjects)
										.addComponent(tfPublisher)
										.addComponent(tfPublicationYear)
										.addComponent(tfISBN)
										.addComponent(tfAuthor)
										.addComponent(tfTitle)
										.addComponent(tfBibNum, GroupLayout.PREFERRED_SIZE, 568, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnAddBooks)
									.addGap(30)
									.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblAddBooks_1, GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addComponent(lblAddBooks_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBibNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfBibNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfTitle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAuthor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfAuthor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblISBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfISBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPublicationYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfPublicationYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPublisher, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfPublisher, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSubjects, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfSubjects, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblItemType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfItemType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblItemCollection, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfItemCollection, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFloatingItem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfFloatingItem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblItemLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfItemLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfQuantity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddBooks, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
