package com.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotel.entity.UsersEntity;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Long>{

}
