package com.Hotel.services;

import java.util.List;

import com.Hotel.dto.RoomTypeDTO;

public interface IRoomTypeService extends IBaseService<RoomTypeDTO>{
	
	List<RoomTypeDTO> findRoomTypeByHotelId(long id);

}
