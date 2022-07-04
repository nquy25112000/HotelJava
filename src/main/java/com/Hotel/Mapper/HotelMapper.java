package com.Hotel.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.Hotel.dto.HotelDTO;
import com.Hotel.entity.HotelEntity;

@Mapper(componentModel = "spring")
public interface HotelMapper {
	HotelDTO hotelEntityToHotelDTO(HotelEntity hotelEntity);

	List<HotelDTO> listHotelEntityToHotelDTO(List<HotelEntity> hotelEntity);

	HotelEntity hotelDTOToHotelEntity(HotelDTO dto);
}
