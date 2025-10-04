package com.Repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.model.Hospital;
import DBHandler.DBConnection;

@Repository
public class HospitalRepo {
	private static final String FIND_QUERY="SELECT * FROM HOSPITALS WHERE LOCATION=?";
	
	public List<Hospital> findByLocation(String location) {
		List<Hospital> h= new ArrayList();
		
		try {
			Connection con=DBConnection.connect();
			PreparedStatement ps=con.prepareStatement(FIND_QUERY);
			ps.setString(1, location);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Hospital hs=new Hospital();
				hs.setId(rs.getLong(1));
				hs.setName(rs.getString(2));
				hs.setLocation(rs.getString(3));
				hs.setBeds(rs.getInt(4));
				h.add(hs);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return h;
	}
}
