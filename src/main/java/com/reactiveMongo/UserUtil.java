/**
this is to convert the UserDto to User entity and vice versa

 * 
 */
package com.reactiveMongo;

import org.springframework.beans.BeanUtils;

/**
 * @author 
 *
 */
public class UserUtil {
	
	//Entity to DTO
	//UserDto to User
	public static UserDto entityToDto(User user){
		UserDto dto = new UserDto();
		 BeanUtils.copyProperties(user, dto);   //Only both the class have Same Attributes                                  //argument (Source, Destination)
		 return dto;
	}
	
	//DTO TO ENTITY
		//DTO to USER
	public static User dtoToEntity(UserDto dto) {
		User user = new User();
		BeanUtils.copyProperties(dto, user);          //argument (Source, Destination)
		return user;
	}

}
