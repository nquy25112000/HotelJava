package com.Hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Hotel.entity.RoomTypeEntity;

@Repository
public interface RoomTypeRepositoty extends JpaRepository<RoomTypeEntity, Long>{

	@Query(value = "select * from roomtype where roomtype.hotel_id = ?1",nativeQuery = true)
	List<RoomTypeEntity> listRoomTypeByHotel(long id); 
	
}
