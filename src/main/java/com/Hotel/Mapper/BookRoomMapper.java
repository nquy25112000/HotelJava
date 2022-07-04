package com.Hotel.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.Hotel.dto.BookRoomDTO;
import com.Hotel.entity.BookRoomEntity;

@Mapper(componentModel = "spring")
public interface BookRoomMapper {
	List<BookRoomDTO> listBookRoomEntitytoBookRoomDTO(List<BookRoomEntity> list);

	BookRoomEntity bookRoomDTOtoBookRoomEntity(BookRoomDTO dto);

	BookRoomDTO bookRoomEntityToBookRoomDTO(BookRoomEntity entity);
}
