package com.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotel.entity.BillEntity;

@Repository
public interface BillRepository extends JpaRepository<BillEntity, Long>{

}
