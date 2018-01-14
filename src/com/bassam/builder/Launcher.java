package com.bassam.builder;

import com.bassam.builder.User.UserBuilder;

public class Launcher {
	
	public static void main(String [] args){
		User userJustRequird= new User.UserBuilder("Bassam", "Aldalati")
				.build();
		
		User user= new User.UserBuilder("Bassam", "Aldalati")
				.phone(01255).address("Stockholm").build();
		
		System.out.println("FirstName:"+userJustRequird.getFirstName()+" LastName:"+userJustRequird.getLastName());
			
		System.out.println("FirstName:"+user.getFirstName()+" LastName:"+user.getLastName()
		+" Address:"+user.getAddress()+" Phone:"+user.getPhone());
	}

}
