import java.sql.*;
public class IssueBookDao {
	
public static boolean checkBook(String bibNum){
	boolean status=false;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from books where bibNum=?");
		ps.setString(1,bibNum);
	    ResultSet rs=ps.executeQuery();
		status=rs.next();
		con.close();
	}catch(Exception e){
		System.out.println(e);
	}
	return status;
}

public static int save(String bibNum,int studentid,String studentname,String studentcontact){
	int status=0;
	try{
		Connection con=DB.getConnection();
		
		status=updatebook(bibNum);//updating quantity and issue
		
		if(status>0){
		PreparedStatement ps=con.prepareStatement("insert into issuebooks(bibNum,studentid,studentname,studentcontact) values(?,?,?,?)");
		ps.setString(1,bibNum);
		ps.setInt(2,studentid);
		ps.setString(3,studentname);
		ps.setString(4,studentcontact);
		status=ps.executeUpdate();
		
		PreparedStatement psh=con.prepareStatement("insert into issuehistory(bibNum,studentid,studentname,studentcontact) values(?,?,?,?)");
		psh.setString(1,bibNum);
		psh.setInt(2,studentid);
		psh.setString(3,studentname);
		psh.setString(4,studentcontact);
		status=psh.executeUpdate();
		}
		
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}




public static int updatebook(String bibNum){
	int status=0;
	int itemCount=0,issued=0;
	try{
		Connection con=DB.getConnection();
		
		PreparedStatement ps=con.prepareStatement("select itemCount,issued from books where bibNum=?");
		ps.setString(1,bibNum);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			itemCount=rs.getInt("itemCount");
			issued=rs.getInt("issued");
		}
		
		if(itemCount>0){
		PreparedStatement ps2=con.prepareStatement("update books set itemCount=?,issued=? where bibNum=?");
		ps2.setInt(1,itemCount-1);
		ps2.setInt(2,issued+1);
		ps2.setString(3,bibNum);
		
		status=ps2.executeUpdate();
		}
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
