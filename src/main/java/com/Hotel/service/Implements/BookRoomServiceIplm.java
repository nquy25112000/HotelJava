package com.Hotel.service.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel.Mapper.BookRoomMapper;
import com.Hotel.dto.BookRoomDTO;
import com.Hotel.entity.BookRoomEntity;
import com.Hotel.repository.BookRoomRepository;
import com.Hotel.services.IBookRoomService;

@Service
public class BookRoomServiceIplm implements IBookRoomService {

	@Autowired
	private BookRoomMapper BookRoomMapper;

	@Autowired
	private BookRoomRepository Repositoty;

	@Override
	public List<BookRoomDTO> findAll(long roomId) {
		List<BookRoomDTO> listBookRoom = BookRoomMapper.listBookRoomEntitytoBookRoomDTO(Repositoty.findAll());
		for (int i = 0; i < listBookRoom.size(); i++) {
			if (listBookRoom.get(i).getRoom_id() != roomId) {
				listBookRoom.remove(i); 
			}
			i++;
		}
		return listBookRoom;
	}

	@Override
	public BookRoomDTO update(long id, BookRoomDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookRoomDTO> delete(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookRoomDTO save(BookRoomDTO dto) {
		BookRoomEntity entity = BookRoomMapper.bookRoomDTOtoBookRoomEntity(dto);
		Repositoty.save(entity);
		return dto;
	}

	@Override
	public BookRoomDTO findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookRoomDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
