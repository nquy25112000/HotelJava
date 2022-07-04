package com.Hotel.service.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel.Mapper.RoomTypeMapper;
import com.Hotel.dto.RoomTypeDTO;
import com.Hotel.entity.RoomTypeEntity;
import com.Hotel.repository.RoomTypeRepositoty;
import com.Hotel.services.IBaseService;
import com.Hotel.services.IRoomTypeService;

@Service
public class RoomTypeServiceIplm implements IRoomTypeService{

	@Autowired
	private RoomTypeRepositoty Repository;
	
	@Autowired
	private RoomTypeMapper RoomTypeMapper;

	@Override
	public List<RoomTypeDTO> findAll() {
		List<RoomTypeDTO> list = RoomTypeMapper.listRoomTypeEntityToRoomTypeDTO(Repository.findAll());
		return list;
	}

	@Override
	public RoomTypeDTO update(long id,RoomTypeDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoomTypeDTO> delete(long id) {
		Repository.deleteById(id);
		return this.findAll();
	}

	@Override
	public RoomTypeDTO save(RoomTypeDTO dto) {
		RoomTypeEntity entity = RoomTypeMapper.RoomtypeDTOtoRoomTypeEntity(dto);
		Repository.save(entity);
		return dto;
	}

	@Override
	public RoomTypeDTO findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoomTypeDTO> findRoomTypeByHotelId(long id) {
		List<RoomTypeDTO> list = RoomTypeMapper.listRoomTypeEntityToRoomTypeDTO(Repository.listRoomTypeByHotel(id));
		return list;
	}


	
}
