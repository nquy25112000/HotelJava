package com.Hotel.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.Hotel.dto.RoomDTO;
import com.Hotel.entity.RoomEntity;

@Mapper(componentModel = "spring")
public interface RoomMapper {
	List<RoomDTO> listRoomEntitytoRoomDTO(List<RoomEntity> list);
	
	RoomEntity roomDTOtoRoomEntity(RoomDTO dto);
	
	RoomDTO roomEntitytoRoomDTO(RoomEntity entity);
}
