import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReturnBookDao {
	public static int delete(String bibNum,int studentid){
		int status=0;
		try{
			Connection con=DB.getConnection();
			
			status=updatebook(bibNum);//updating quantity and issue
			
			if(status>0){
			PreparedStatement ps=con.prepareStatement("delete from issuebooks where bibNum=? and studentid=?");
			ps.setString(1,bibNum);
			ps.setInt(2,studentid);
			status=ps.executeUpdate();
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
			
			if(issued>0){
			PreparedStatement ps2=con.prepareStatement("update books set itemCount=?,issued=? where bibNum=?");
			ps2.setInt(1,itemCount+1);
			ps2.setInt(2,issued-1);
			ps2.setString(3,bibNum);
			
			status=ps2.executeUpdate();
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
}
