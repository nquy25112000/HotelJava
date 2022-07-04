package com.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotel.entity.BookRoomEntity;

@Repository
public interface BookRoomRepository extends JpaRepository<BookRoomEntity, Long>{

}
