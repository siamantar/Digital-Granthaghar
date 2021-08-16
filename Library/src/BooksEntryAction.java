import java.sql.Connection;
import java.sql.PreparedStatement;

public class BooksEntryAction {


public static int save(String bibNum, String title, String author, String iSBN, String publicationYear,
		String publisher, String subjects, String itemType, String itemCollection, String floatingItem,
		String itemLocation, int itemCount) {
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into books( bibNum,  title,  author,  iSBN,  publicationYear,  publisher,  subjects,  itemType,  itemCollection,  floatingItem, itemLocation,  itemCount) values(?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,bibNum);
		ps.setString(2,title);
		ps.setString(3,author);
		ps.setString(4,iSBN);
		ps.setString(5,publicationYear);
		ps.setString(6,publisher);
		ps.setString(7,subjects);
		ps.setString(8,itemType);
		ps.setString(9,itemCollection);
		ps.setString(10,floatingItem);
		ps.setString(11,itemLocation);
		//ps.setString(12,reportDate);
		ps.setInt(12,itemCount);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
	// TODO Auto-generated method stub
	//return 0;
}
}
