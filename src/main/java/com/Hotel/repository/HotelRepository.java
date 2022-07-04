package com.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Hotel.entity.HotelEntity;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, Long> {
	@Query(value = "select * from hotel where hotel.id = ?1 ", nativeQuery = true)
	HotelEntity findId(long id);

	@Query(value = "select * from hotel where hotel.name = ?1 ", nativeQuery = true)
	HotelEntity findByName(String name);
}
