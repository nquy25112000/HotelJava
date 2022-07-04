package com.Hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotel.dto.RoomTypeDTO;
import com.Hotel.entity.RoomTypeEntity;
import com.Hotel.service.Implements.HotelServiceIplm;
import com.Hotel.service.Implements.RoomTypeServiceIplm;

@RestController
@RequestMapping("type")
public class RoomTypeController {

	@Autowired
	RoomTypeServiceIplm roomTypeService;

	@Autowired
	HotelServiceIplm hotelService;

	@GetMapping("/entity")
	public List<RoomTypeDTO> getAllHotel() {
		return roomTypeService.findAll();
	}

	@GetMapping("/findOne/{id}")
	public RoomTypeDTO findOne(@PathVariable long id) {
		return roomTypeService.findById(id);
	}
	
	@GetMapping("/hotel/{id}")
	public List<RoomTypeDTO> findRoomTypeByHotel(@PathVariable long id) {
		return roomTypeService.findRoomTypeByHotelId(id);
	}

	@PostMapping("/create")
	public ResponseEntity<RoomTypeDTO> createComment(@RequestBody RoomTypeDTO dto) {
		roomTypeService.save(dto);
		return new ResponseEntity<>(dto, HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{id}")
	public List<RoomTypeDTO> delete(@PathVariable long id) {
		roomTypeService.delete(id);
		return this.getAllHotel();
	}
}
