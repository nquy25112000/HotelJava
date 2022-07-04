package com.Hotel.service.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel.Mapper.RoomMapper;
import com.Hotel.dto.RoomDTO;
import com.Hotel.entity.RoomEntity;
import com.Hotel.repository.RoomRepository;
import com.Hotel.services.IRoomService;

@Service
public class RoomServiceIplm implements IRoomService{
	
	@Autowired
	private RoomRepository Repository;
	
	@Autowired
	private RoomMapper RoomMapper;

	@Override
	public List<RoomDTO> findAll() {
		List<RoomDTO> list = RoomMapper.listRoomEntitytoRoomDTO(Repository.findAll());
		return list;
	}

	@Override
	public RoomDTO update(long id, RoomDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoomDTO> delete(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoomDTO save(RoomDTO dto) {
		RoomEntity entity = RoomMapper.roomDTOtoRoomEntity(dto);
		Repository.save(entity);
		return dto;
	}

	@Override
	public RoomDTO findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
