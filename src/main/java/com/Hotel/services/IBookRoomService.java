package com.Hotel.services;

import java.util.List;

import com.Hotel.dto.BookRoomDTO;

public interface IBookRoomService extends IBaseService<BookRoomDTO>{

	List<BookRoomDTO> findAll(long bookRoomId);


}
