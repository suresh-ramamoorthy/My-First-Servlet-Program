package com.smartuniversity.db;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.smartuniversity.dto.User;

public class DatabaseUtil {

private static List<User> userList = new ArrayList<User>();
	
	public static void save(User user) {
		userList.add(user);
	}
	
	public static List<User> getAllUsers(){
		return userList;
	}
	
	public static User getUser(UUID id) {
		
		User userobj = null;
		for(User user : userList) {
			
			if(user.getId().equals(id)){
				userobj=user;
				break;
				
				
			}
			
		}
		return userobj;
		
	}
}
