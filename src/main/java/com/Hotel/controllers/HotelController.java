package com.Hotel.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Hotel.dto.HotelDTO;
import com.Hotel.service.Implements.HotelServiceIplm;

@RestController
@RequestMapping("hotel")
public class HotelController {

	@Autowired
	HotelServiceIplm hotelServices;

	@GetMapping("/entity")
	public ResponseEntity<List<HotelDTO>> getAllHotel() {
		List<HotelDTO> listHotel = hotelServices.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(listHotel);
	}

	@GetMapping("/findOne/{id}")
	public ResponseEntity<HotelDTO> findOne2(@PathVariable long id) {
		HotelDTO hotelDto = hotelServices.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(hotelDto);
	}

	@PostMapping("/create")
	public ResponseEntity<HotelDTO> created(@Valid @RequestBody HotelDTO dto) {
		HotelDTO hotelDto = hotelServices.save(dto);
		return ResponseEntity.status(HttpStatus.OK).body(hotelDto);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<List<HotelDTO>> delete(@PathVariable long id) {
		List<HotelDTO> list = hotelServices.delete(id);
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<HotelDTO> update(@PathVariable long id , @RequestBody HotelDTO dto) {
		HotelDTO dto2 = hotelServices.update(id,dto);
		return ResponseEntity.status(HttpStatus.OK).body(dto2);
	
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});
		return errors;
	}
}
