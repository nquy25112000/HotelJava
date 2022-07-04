package com.Hotel.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.Hotel.dto.RoomTypeDTO;
import com.Hotel.entity.RoomTypeEntity;

@Mapper(componentModel = "spring")
public interface RoomTypeMapper {
	List<RoomTypeDTO> listRoomTypeEntityToRoomTypeDTO(List<RoomTypeEntity> list);

	RoomTypeEntity RoomtypeDTOtoRoomTypeEntity(RoomTypeDTO dto);

	RoomTypeDTO RoomTypeEntityToRoomTypeDTO(RoomTypeEntity entity);
}
