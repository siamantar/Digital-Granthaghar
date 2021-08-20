import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;

public class ViewBooks extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JPanel panel;
	private JLabel JLTtitle;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBooks frame = new ViewBooks();
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
	public ViewBooks() { //constructor
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//retrieving data from db
		String data[][]=null;
		String column[]=null;
		String sql = "select * from books";
		try (Connection con = DB.getConnection();
	         Statement ps  = con.createStatement();
	         ResultSet rs  = ps.executeQuery(sql) ){
			
			//get column information
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols=rsmd.getColumnCount();
			column=new String[cols];
			for(int i=1; i<=cols; i++){
				column[i-1]=rsmd.getColumnName(i);
			}
			
			//get row information
			String sql1 = "select count(*) from books";
			Statement ps1 = con.createStatement();
			ResultSet rs1 = ps1.executeQuery(sql1);
			rs1.next();
			int rows = rs1.getInt(1);
			//System.out.println("rows: "+ rows+ " Cols: "+ cols);
			rs1.close();
			
			data=new String[rows][cols];
			int count=0;
			
			while(rs.next()){
				for(int i=1; i<=cols; i++){
					data[count][i-1]=rs.getString(i);
				}
				count++;
			}
		}catch (SQLException e) {
            System.out.println(e.getMessage());
        }
		
		//table = new JTable(data,column);
		table = new JTable(data,column) {
			public boolean isCellEditable(int data, int column) {
		        return false;
		    }
		};
		
		table.setColumnSelectionAllowed(true);
		JScrollPane sp=new JScrollPane(table);
		contentPane.add(sp, BorderLayout.CENTER);
		
		panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(2);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLTtitle = new JLabel("Library Database");
		JLTtitle.setHorizontalAlignment(SwingConstants.CENTER);
		JLTtitle.setForeground(Color.GRAY);
		JLTtitle.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel.add(JLTtitle);
	}

}
