package com.Hotel.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.Hotel.dto.UsersDTO;
import com.Hotel.entity.UsersEntity;

@Mapper(componentModel = "spring")
public interface UsersMapper {
	
	List<UsersDTO> listUserEntityToListUserDTO(List<UsersEntity> entity);
	
	UsersEntity UsersDTOtoUserEntity(UsersDTO dto);
	
	UsersDTO UsersEntitytoUsersDTO(UsersEntity entity);

}
