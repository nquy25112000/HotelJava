package com.Hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotel.dto.BookRoomDTO;
import com.Hotel.service.Implements.BookRoomServiceIplm;

@RestController
@RequestMapping("bookroom")
public class BookRoomController {

	@Autowired
	private BookRoomServiceIplm bookRoomService;
	
	@GetMapping("/findAll/{roomId}")
	public ResponseEntity<List<BookRoomDTO>> getAllHotel(@PathVariable long roomId) {
		List<BookRoomDTO> list = bookRoomService.findAll(roomId);
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
}
