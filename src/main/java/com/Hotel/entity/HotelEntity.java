package com.Hotel.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hotel")
public class HotelEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String adress;
	
	private String phone;
	
	private String email;

	@JsonIgnore
	@OneToMany(mappedBy = "hotel",fetch = FetchType.LAZY)
	private List<RoomTypeEntity> listRoomType;
	
	@JsonIgnore
	@OneToMany(mappedBy = "hotel2",fetch = FetchType.LAZY)
	private List<UsersEntity> listUsers;
	
	@JsonIgnore
	@OneToMany(mappedBy = "hotel3",fetch = FetchType.LAZY)
	private List<RoomEntity> listRoom;

}
