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
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ViewLibrarian extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLibrarian frame = new ViewLibrarian();
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
	public ViewLibrarian() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 739, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		String data[][]=null;
		String column[]=null;
		String dTable= "librarian";
		String sql = "select * from "+ dTable;
		try(Connection con = DB.getConnection();
	        Statement ps  = con.createStatement();
	        ResultSet rs  = ps.executeQuery(sql) ){
				
				//get column information
				ResultSetMetaData rsmd=rs.getMetaData();
				int cols=rsmd.getColumnCount();
				column=new String[cols];
				for(int i=1; i<=cols; i++){
					column[i-1]=rsmd.getColumnName(i);
				}
				
				//get column information
				String sql1 = "select count(*) from "+ dTable;
				Statement ps1 = con.createStatement();
				ResultSet rs1 = ps1.executeQuery(sql1);
				rs1.next();
				int rows = rs1.getInt(1);
//				System.out.println("rows: "+ rows+ " Cols: "+ cols);
				rs1.close();
				
				data=new String[rows][cols]; //declaring size of 2D array  as per data of the table
				int count=0;
				
				while(rs.next()){
					for(int i=1; i<=cols; i++){
						data[count][i-1]=rs.getString(i);
					}

/*
					//showing results in log
					for(int i=1; i<=cols; i++){
						System.out.print(data[count][i-1] + "\t" );
					}
					System.out.println("\n--------");
*/
					count++;
				}
				
	            
/*
				// loop through the result set
	            while (rs.next()) {
	                System.out.println(rs.getInt("id") +  "\t" + 
	                                   rs.getString("name") + "\t" +
	                                   rs.getString("password"));
	            }
*/
	            con.close();
	        }catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
			/*
			//old data retrieving code
			try{
				Connection con=DB.getConnection();
				PreparedStatement ps=con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	
				System.err.println("pass here: ");//System.exit(0);
				ResultSet rs=ps.executeQuery();
				
	//			Statement ps=con.createStatement();
	//			ResultSet rs=ps.executeQuery(sql);
				
				ResultSetMetaData rsmd=rs.getMetaData();
				int cols=rsmd.getColumnCount();
				column=new String[cols];
				for(int i=1;i<=cols;i++){
					column[i-1]=rsmd.getColumnName(i);
				}
				
				rs.last();
				int rows=rs.getRow();
				rs.beforeFirst();
	
				data=new String[rows][cols];
				int count=0;
				while(rs.next()){
					for(int i=1;i<=cols;i++){
						data[count][i-1]=rs.getString(i);
						 System.out.println(
						 		rs.getInt("id") +  "\t" + 
						 		rs.getString("name") + "\t" +
						 		rs.getDouble("password")
						 );
					}
					count++;
				}
				con.close();
			}catch(Exception e){
				System.out.println(e);
			}
		*/
		
		/*
		//old table code
		table = new JTable(data,column);
		JScrollPane sp=new JScrollPane(table);
		contentPane.add(sp, BorderLayout.CENTER);
		*/
		table = new JTable(data,column) {
			public boolean isCellEditable(int data, int column) {
		        return false;
		    }
		};
		table.setColumnSelectionAllowed(true);
		JScrollPane sp=new JScrollPane(table);
		contentPane.add(sp, BorderLayout.CENTER);
		
		lblNewLabel = new JLabel("List of Librarians");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
	}

}
