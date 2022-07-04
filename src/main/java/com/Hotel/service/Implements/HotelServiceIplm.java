package com.Hotel.service.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel.Exception.HotelException;
import com.Hotel.Mapper.HotelMapper;
import com.Hotel.dto.HotelDTO;
import com.Hotel.dto.RoomTypeDTO;
import com.Hotel.entity.HotelEntity;
import com.Hotel.repository.HotelRepository;
import com.Hotel.services.IHotelService;

@Service
public class HotelServiceIplm implements IHotelService {

	@Autowired
	private HotelRepository Repository;

	@Autowired
	private HotelMapper HotelMapper;
	
	@Autowired
	private RoomTypeServiceIplm RoomTypeService;

	@Override
	public List<HotelDTO> findAll() {
		return HotelMapper.listHotelEntityToHotelDTO(Repository.findAll());
	}

	@Override
	public List<HotelDTO> delete(long id) {
		try {
			Repository.deleteById(id);
		} catch (Exception e) {
			throw new HotelException("ID Not Found");
		}
		return this.findAll();
	}
	@Override
	public HotelDTO save(HotelDTO dto) {
		HotelDTO name = this.findByName(dto.getName());
		if (name != null)
			throw new HotelException("Name already exist");
		
		boolean isNum = false;
		isNum = dto.getPhone().matches("[0-9]+[\\.]?[0-9]*");
		if (!isNum)
			throw new HotelException("Please enter the phone number in the correct format");
		HotelEntity hotelEntity = HotelMapper.hotelDTOToHotelEntity(dto);
		Repository.save(hotelEntity);
		return dto;
	}

	@Override
	public HotelDTO findByName(String name) {
		HotelEntity entity = Repository.findByName(name);
		HotelDTO dto = HotelMapper.hotelEntityToHotelDTO(entity);
		return dto;
	}

	@Override
	public HotelDTO findById(long id) {
		HotelEntity entity = Repository.findId(id);
		HotelDTO dto = HotelMapper.hotelEntityToHotelDTO(entity);
		List<RoomTypeDTO> listRoomType = RoomTypeService.findRoomTypeByHotelId(id);
		dto.setListRoomType(listRoomType);
		return dto;

	}

	@Override
	public HotelDTO update(long id, HotelDTO dto) {
		dto.setId(id);
		HotelEntity entity = HotelMapper.hotelDTOToHotelEntity(dto);
		Repository.save(entity);
		return dto;
	}
}
