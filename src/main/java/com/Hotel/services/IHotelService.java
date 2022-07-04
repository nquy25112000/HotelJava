package com.Hotel.services;

import com.Hotel.dto.HotelDTO;

public interface IHotelService extends IBaseService<HotelDTO> {
	HotelDTO findByName(String name);
}
